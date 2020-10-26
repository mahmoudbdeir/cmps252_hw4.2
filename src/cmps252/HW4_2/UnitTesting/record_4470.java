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

@Tag("32")
class Record_4470 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4470: FirstName is Landon")
	void FirstNameOfRecord4470() {
		assertEquals("Landon", customers.get(4469).getFirstName());
	}

	@Test
	@DisplayName("Record 4470: LastName is Rohe")
	void LastNameOfRecord4470() {
		assertEquals("Rohe", customers.get(4469).getLastName());
	}

	@Test
	@DisplayName("Record 4470: Company is Winget & Kane")
	void CompanyOfRecord4470() {
		assertEquals("Winget & Kane", customers.get(4469).getCompany());
	}

	@Test
	@DisplayName("Record 4470: Address is 1520 Westwd Bl")
	void AddressOfRecord4470() {
		assertEquals("1520 Westwd Bl", customers.get(4469).getAddress());
	}

	@Test
	@DisplayName("Record 4470: City is Los Angeles")
	void CityOfRecord4470() {
		assertEquals("Los Angeles", customers.get(4469).getCity());
	}

	@Test
	@DisplayName("Record 4470: County is Los Angeles")
	void CountyOfRecord4470() {
		assertEquals("Los Angeles", customers.get(4469).getCounty());
	}

	@Test
	@DisplayName("Record 4470: State is CA")
	void StateOfRecord4470() {
		assertEquals("CA", customers.get(4469).getState());
	}

	@Test
	@DisplayName("Record 4470: ZIP is 90024")
	void ZIPOfRecord4470() {
		assertEquals("90024", customers.get(4469).getZIP());
	}

	@Test
	@DisplayName("Record 4470: Phone is 310-470-8411")
	void PhoneOfRecord4470() {
		assertEquals("310-470-8411", customers.get(4469).getPhone());
	}

	@Test
	@DisplayName("Record 4470: Fax is 310-470-8441")
	void FaxOfRecord4470() {
		assertEquals("310-470-8441", customers.get(4469).getFax());
	}

	@Test
	@DisplayName("Record 4470: Email is landon@rohe.com")
	void EmailOfRecord4470() {
		assertEquals("landon@rohe.com", customers.get(4469).getEmail());
	}

	@Test
	@DisplayName("Record 4470: Web is http://www.landonrohe.com")
	void WebOfRecord4470() {
		assertEquals("http://www.landonrohe.com", customers.get(4469).getWeb());
	}
}
