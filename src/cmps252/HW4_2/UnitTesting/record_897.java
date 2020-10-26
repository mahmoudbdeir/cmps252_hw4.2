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

@Tag("47")
class Record_897 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 897: FirstName is April")
	void FirstNameOfRecord897() {
		assertEquals("April", customers.get(896).getFirstName());
	}

	@Test
	@DisplayName("Record 897: LastName is Hergenreter")
	void LastNameOfRecord897() {
		assertEquals("Hergenreter", customers.get(896).getLastName());
	}

	@Test
	@DisplayName("Record 897: Company is Young, John R Esq")
	void CompanyOfRecord897() {
		assertEquals("Young, John R Esq", customers.get(896).getCompany());
	}

	@Test
	@DisplayName("Record 897: Address is 1 W Frankfort Industrial")
	void AddressOfRecord897() {
		assertEquals("1 W Frankfort Industrial", customers.get(896).getAddress());
	}

	@Test
	@DisplayName("Record 897: City is Frankfort")
	void CityOfRecord897() {
		assertEquals("Frankfort", customers.get(896).getCity());
	}

	@Test
	@DisplayName("Record 897: County is Herkimer")
	void CountyOfRecord897() {
		assertEquals("Herkimer", customers.get(896).getCounty());
	}

	@Test
	@DisplayName("Record 897: State is NY")
	void StateOfRecord897() {
		assertEquals("NY", customers.get(896).getState());
	}

	@Test
	@DisplayName("Record 897: ZIP is 13340")
	void ZIPOfRecord897() {
		assertEquals("13340", customers.get(896).getZIP());
	}

	@Test
	@DisplayName("Record 897: Phone is 315-724-9336")
	void PhoneOfRecord897() {
		assertEquals("315-724-9336", customers.get(896).getPhone());
	}

	@Test
	@DisplayName("Record 897: Fax is 315-724-7824")
	void FaxOfRecord897() {
		assertEquals("315-724-7824", customers.get(896).getFax());
	}

	@Test
	@DisplayName("Record 897: Email is april@hergenreter.com")
	void EmailOfRecord897() {
		assertEquals("april@hergenreter.com", customers.get(896).getEmail());
	}

	@Test
	@DisplayName("Record 897: Web is http://www.aprilhergenreter.com")
	void WebOfRecord897() {
		assertEquals("http://www.aprilhergenreter.com", customers.get(896).getWeb());
	}
}
