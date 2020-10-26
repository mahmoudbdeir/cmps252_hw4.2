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

@Tag("13")
class Record_260 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 260: FirstName is Desmond")
	void FirstNameOfRecord260() {
		assertEquals("Desmond", customers.get(259).getFirstName());
	}

	@Test
	@DisplayName("Record 260: LastName is Lincourt")
	void LastNameOfRecord260() {
		assertEquals("Lincourt", customers.get(259).getLastName());
	}

	@Test
	@DisplayName("Record 260: Company is Far Cliffs Consulting")
	void CompanyOfRecord260() {
		assertEquals("Far Cliffs Consulting", customers.get(259).getCompany());
	}

	@Test
	@DisplayName("Record 260: Address is Rts 33 & 191")
	void AddressOfRecord260() {
		assertEquals("Rts 33 & 191", customers.get(259).getAddress());
	}

	@Test
	@DisplayName("Record 260: City is Stockertown")
	void CityOfRecord260() {
		assertEquals("Stockertown", customers.get(259).getCity());
	}

	@Test
	@DisplayName("Record 260: County is Northampton")
	void CountyOfRecord260() {
		assertEquals("Northampton", customers.get(259).getCounty());
	}

	@Test
	@DisplayName("Record 260: State is PA")
	void StateOfRecord260() {
		assertEquals("PA", customers.get(259).getState());
	}

	@Test
	@DisplayName("Record 260: ZIP is 18083")
	void ZIPOfRecord260() {
		assertEquals("18083", customers.get(259).getZIP());
	}

	@Test
	@DisplayName("Record 260: Phone is 610-759-8721")
	void PhoneOfRecord260() {
		assertEquals("610-759-8721", customers.get(259).getPhone());
	}

	@Test
	@DisplayName("Record 260: Fax is 610-759-8753")
	void FaxOfRecord260() {
		assertEquals("610-759-8753", customers.get(259).getFax());
	}

	@Test
	@DisplayName("Record 260: Email is desmond@lincourt.com")
	void EmailOfRecord260() {
		assertEquals("desmond@lincourt.com", customers.get(259).getEmail());
	}

	@Test
	@DisplayName("Record 260: Web is http://www.desmondlincourt.com")
	void WebOfRecord260() {
		assertEquals("http://www.desmondlincourt.com", customers.get(259).getWeb());
	}
}
