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

@Tag("38")
class Record_4069 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4069: FirstName is Cory")
	void FirstNameOfRecord4069() {
		assertEquals("Cory", customers.get(4068).getFirstName());
	}

	@Test
	@DisplayName("Record 4069: LastName is Winterfeldt")
	void LastNameOfRecord4069() {
		assertEquals("Winterfeldt", customers.get(4068).getLastName());
	}

	@Test
	@DisplayName("Record 4069: Company is Berwyler & Sons Inc")
	void CompanyOfRecord4069() {
		assertEquals("Berwyler & Sons Inc", customers.get(4068).getCompany());
	}

	@Test
	@DisplayName("Record 4069: Address is 601 13th St Nw  #-450")
	void AddressOfRecord4069() {
		assertEquals("601 13th St Nw  #-450", customers.get(4068).getAddress());
	}

	@Test
	@DisplayName("Record 4069: City is Washington")
	void CityOfRecord4069() {
		assertEquals("Washington", customers.get(4068).getCity());
	}

	@Test
	@DisplayName("Record 4069: County is District of Columbia")
	void CountyOfRecord4069() {
		assertEquals("District of Columbia", customers.get(4068).getCounty());
	}

	@Test
	@DisplayName("Record 4069: State is DC")
	void StateOfRecord4069() {
		assertEquals("DC", customers.get(4068).getState());
	}

	@Test
	@DisplayName("Record 4069: ZIP is 20005")
	void ZIPOfRecord4069() {
		assertEquals("20005", customers.get(4068).getZIP());
	}

	@Test
	@DisplayName("Record 4069: Phone is 202-783-7912")
	void PhoneOfRecord4069() {
		assertEquals("202-783-7912", customers.get(4068).getPhone());
	}

	@Test
	@DisplayName("Record 4069: Fax is 202-783-5073")
	void FaxOfRecord4069() {
		assertEquals("202-783-5073", customers.get(4068).getFax());
	}

	@Test
	@DisplayName("Record 4069: Email is cory@winterfeldt.com")
	void EmailOfRecord4069() {
		assertEquals("cory@winterfeldt.com", customers.get(4068).getEmail());
	}

	@Test
	@DisplayName("Record 4069: Web is http://www.corywinterfeldt.com")
	void WebOfRecord4069() {
		assertEquals("http://www.corywinterfeldt.com", customers.get(4068).getWeb());
	}
}
