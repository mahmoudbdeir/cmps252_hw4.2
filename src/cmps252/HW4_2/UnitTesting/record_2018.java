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

@Tag("36")
class Record_2018 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2018: FirstName is Casandra")
	void FirstNameOfRecord2018() {
		assertEquals("Casandra", customers.get(2017).getFirstName());
	}

	@Test
	@DisplayName("Record 2018: LastName is Morgana")
	void LastNameOfRecord2018() {
		assertEquals("Morgana", customers.get(2017).getLastName());
	}

	@Test
	@DisplayName("Record 2018: Company is Premiere Business Products Inc")
	void CompanyOfRecord2018() {
		assertEquals("Premiere Business Products Inc", customers.get(2017).getCompany());
	}

	@Test
	@DisplayName("Record 2018: Address is 60 Main Ave")
	void AddressOfRecord2018() {
		assertEquals("60 Main Ave", customers.get(2017).getAddress());
	}

	@Test
	@DisplayName("Record 2018: City is Sacramento")
	void CityOfRecord2018() {
		assertEquals("Sacramento", customers.get(2017).getCity());
	}

	@Test
	@DisplayName("Record 2018: County is Sacramento")
	void CountyOfRecord2018() {
		assertEquals("Sacramento", customers.get(2017).getCounty());
	}

	@Test
	@DisplayName("Record 2018: State is CA")
	void StateOfRecord2018() {
		assertEquals("CA", customers.get(2017).getState());
	}

	@Test
	@DisplayName("Record 2018: ZIP is 95838")
	void ZIPOfRecord2018() {
		assertEquals("95838", customers.get(2017).getZIP());
	}

	@Test
	@DisplayName("Record 2018: Phone is 916-920-8840")
	void PhoneOfRecord2018() {
		assertEquals("916-920-8840", customers.get(2017).getPhone());
	}

	@Test
	@DisplayName("Record 2018: Fax is 916-920-9448")
	void FaxOfRecord2018() {
		assertEquals("916-920-9448", customers.get(2017).getFax());
	}

	@Test
	@DisplayName("Record 2018: Email is casandra@morgana.com")
	void EmailOfRecord2018() {
		assertEquals("casandra@morgana.com", customers.get(2017).getEmail());
	}

	@Test
	@DisplayName("Record 2018: Web is http://www.casandramorgana.com")
	void WebOfRecord2018() {
		assertEquals("http://www.casandramorgana.com", customers.get(2017).getWeb());
	}
}
