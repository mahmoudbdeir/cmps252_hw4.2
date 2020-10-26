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

@Tag("8")
class Record_2989 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2989: FirstName is Leora")
	void FirstNameOfRecord2989() {
		assertEquals("Leora", customers.get(2988).getFirstName());
	}

	@Test
	@DisplayName("Record 2989: LastName is Buelna")
	void LastNameOfRecord2989() {
		assertEquals("Buelna", customers.get(2988).getLastName());
	}

	@Test
	@DisplayName("Record 2989: Company is Eugene T Parzych Inc")
	void CompanyOfRecord2989() {
		assertEquals("Eugene T Parzych Inc", customers.get(2988).getCompany());
	}

	@Test
	@DisplayName("Record 2989: Address is 619 Mapunapuna St  #-a")
	void AddressOfRecord2989() {
		assertEquals("619 Mapunapuna St  #-a", customers.get(2988).getAddress());
	}

	@Test
	@DisplayName("Record 2989: City is Honolulu")
	void CityOfRecord2989() {
		assertEquals("Honolulu", customers.get(2988).getCity());
	}

	@Test
	@DisplayName("Record 2989: County is Honolulu")
	void CountyOfRecord2989() {
		assertEquals("Honolulu", customers.get(2988).getCounty());
	}

	@Test
	@DisplayName("Record 2989: State is HI")
	void StateOfRecord2989() {
		assertEquals("HI", customers.get(2988).getState());
	}

	@Test
	@DisplayName("Record 2989: ZIP is 96819")
	void ZIPOfRecord2989() {
		assertEquals("96819", customers.get(2988).getZIP());
	}

	@Test
	@DisplayName("Record 2989: Phone is 808-833-3890")
	void PhoneOfRecord2989() {
		assertEquals("808-833-3890", customers.get(2988).getPhone());
	}

	@Test
	@DisplayName("Record 2989: Fax is 808-833-8561")
	void FaxOfRecord2989() {
		assertEquals("808-833-8561", customers.get(2988).getFax());
	}

	@Test
	@DisplayName("Record 2989: Email is leora@buelna.com")
	void EmailOfRecord2989() {
		assertEquals("leora@buelna.com", customers.get(2988).getEmail());
	}

	@Test
	@DisplayName("Record 2989: Web is http://www.leorabuelna.com")
	void WebOfRecord2989() {
		assertEquals("http://www.leorabuelna.com", customers.get(2988).getWeb());
	}
}
