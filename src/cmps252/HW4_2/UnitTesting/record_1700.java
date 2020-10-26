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

@Tag("33")
class Record_1700 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1700: FirstName is Derek")
	void FirstNameOfRecord1700() {
		assertEquals("Derek", customers.get(1699).getFirstName());
	}

	@Test
	@DisplayName("Record 1700: LastName is Herpolshymer")
	void LastNameOfRecord1700() {
		assertEquals("Herpolshymer", customers.get(1699).getLastName());
	}

	@Test
	@DisplayName("Record 1700: Company is Michael, Fagan J Esq")
	void CompanyOfRecord1700() {
		assertEquals("Michael, Fagan J Esq", customers.get(1699).getCompany());
	}

	@Test
	@DisplayName("Record 1700: Address is 100 Valley Rd  #-104")
	void AddressOfRecord1700() {
		assertEquals("100 Valley Rd  #-104", customers.get(1699).getAddress());
	}

	@Test
	@DisplayName("Record 1700: City is Mount Arlington")
	void CityOfRecord1700() {
		assertEquals("Mount Arlington", customers.get(1699).getCity());
	}

	@Test
	@DisplayName("Record 1700: County is Morris")
	void CountyOfRecord1700() {
		assertEquals("Morris", customers.get(1699).getCounty());
	}

	@Test
	@DisplayName("Record 1700: State is NJ")
	void StateOfRecord1700() {
		assertEquals("NJ", customers.get(1699).getState());
	}

	@Test
	@DisplayName("Record 1700: ZIP is 7856")
	void ZIPOfRecord1700() {
		assertEquals("7856", customers.get(1699).getZIP());
	}

	@Test
	@DisplayName("Record 1700: Phone is 973-584-4184")
	void PhoneOfRecord1700() {
		assertEquals("973-584-4184", customers.get(1699).getPhone());
	}

	@Test
	@DisplayName("Record 1700: Fax is 973-584-4902")
	void FaxOfRecord1700() {
		assertEquals("973-584-4902", customers.get(1699).getFax());
	}

	@Test
	@DisplayName("Record 1700: Email is derek@herpolshymer.com")
	void EmailOfRecord1700() {
		assertEquals("derek@herpolshymer.com", customers.get(1699).getEmail());
	}

	@Test
	@DisplayName("Record 1700: Web is http://www.derekherpolshymer.com")
	void WebOfRecord1700() {
		assertEquals("http://www.derekherpolshymer.com", customers.get(1699).getWeb());
	}
}
