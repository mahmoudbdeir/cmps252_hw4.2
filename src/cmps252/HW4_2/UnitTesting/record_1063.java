package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("6")
class Record_1063 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1063: FirstName is Denny")
	void FirstNameOfRecord1063() {
		assertEquals("Denny", customers.get(1062).getFirstName());
	}

	@Test
	@DisplayName("Record 1063: LastName is Sorn")
	void LastNameOfRecord1063() {
		assertEquals("Sorn", customers.get(1062).getLastName());
	}

	@Test
	@DisplayName("Record 1063: Company is Maclean Fogg Co")
	void CompanyOfRecord1063() {
		assertEquals("Maclean Fogg Co", customers.get(1062).getCompany());
	}

	@Test
	@DisplayName("Record 1063: Address is 110 S Poplar St  #-300")
	void AddressOfRecord1063() {
		assertEquals("110 S Poplar St  #-300", customers.get(1062).getAddress());
	}

	@Test
	@DisplayName("Record 1063: City is Wilmington")
	void CityOfRecord1063() {
		assertEquals("Wilmington", customers.get(1062).getCity());
	}

	@Test
	@DisplayName("Record 1063: County is New Castle")
	void CountyOfRecord1063() {
		assertEquals("New Castle", customers.get(1062).getCounty());
	}

	@Test
	@DisplayName("Record 1063: State is DE")
	void StateOfRecord1063() {
		assertEquals("DE", customers.get(1062).getState());
	}

	@Test
	@DisplayName("Record 1063: ZIP is 19801")
	void ZIPOfRecord1063() {
		assertEquals("19801", customers.get(1062).getZIP());
	}

	@Test
	@DisplayName("Record 1063: Phone is 302-655-6457")
	void PhoneOfRecord1063() {
		assertEquals("302-655-6457", customers.get(1062).getPhone());
	}

	@Test
	@DisplayName("Record 1063: Fax is 302-655-0167")
	void FaxOfRecord1063() {
		assertEquals("302-655-0167", customers.get(1062).getFax());
	}

	@Test
	@DisplayName("Record 1063: Email is denny@sorn.com")
	void EmailOfRecord1063() {
		assertEquals("denny@sorn.com", customers.get(1062).getEmail());
	}

	@Test
	@DisplayName("Record 1063: Web is http://www.dennysorn.com")
	void WebOfRecord1063() {
		assertEquals("http://www.dennysorn.com", customers.get(1062).getWeb());
	}
}
