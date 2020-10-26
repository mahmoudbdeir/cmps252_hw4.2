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

@Tag("43")
class Record_1516 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1516: FirstName is Rayford")
	void FirstNameOfRecord1516() {
		assertEquals("Rayford", customers.get(1515).getFirstName());
	}

	@Test
	@DisplayName("Record 1516: LastName is ysenberger")
	void LastNameOfRecord1516() {
		assertEquals("ysenberger", customers.get(1515).getLastName());
	}

	@Test
	@DisplayName("Record 1516: Company is Suzy Systems Inc")
	void CompanyOfRecord1516() {
		assertEquals("Suzy Systems Inc", customers.get(1515).getCompany());
	}

	@Test
	@DisplayName("Record 1516: Address is 295 Pierson Ave")
	void AddressOfRecord1516() {
		assertEquals("295 Pierson Ave", customers.get(1515).getAddress());
	}

	@Test
	@DisplayName("Record 1516: City is Edison")
	void CityOfRecord1516() {
		assertEquals("Edison", customers.get(1515).getCity());
	}

	@Test
	@DisplayName("Record 1516: County is Middlesex")
	void CountyOfRecord1516() {
		assertEquals("Middlesex", customers.get(1515).getCounty());
	}

	@Test
	@DisplayName("Record 1516: State is NJ")
	void StateOfRecord1516() {
		assertEquals("NJ", customers.get(1515).getState());
	}

	@Test
	@DisplayName("Record 1516: ZIP is 8837")
	void ZIPOfRecord1516() {
		assertEquals("8837", customers.get(1515).getZIP());
	}

	@Test
	@DisplayName("Record 1516: Phone is 732-636-6082")
	void PhoneOfRecord1516() {
		assertEquals("732-636-6082", customers.get(1515).getPhone());
	}

	@Test
	@DisplayName("Record 1516: Fax is 732-636-4061")
	void FaxOfRecord1516() {
		assertEquals("732-636-4061", customers.get(1515).getFax());
	}

	@Test
	@DisplayName("Record 1516: Email is rayford@ysenberger.com")
	void EmailOfRecord1516() {
		assertEquals("rayford@ysenberger.com", customers.get(1515).getEmail());
	}

	@Test
	@DisplayName("Record 1516: Web is http://www.rayfordysenberger.com")
	void WebOfRecord1516() {
		assertEquals("http://www.rayfordysenberger.com", customers.get(1515).getWeb());
	}
}
