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

@Tag("12")
class Record_2703 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2703: FirstName is Reyes")
	void FirstNameOfRecord2703() {
		assertEquals("Reyes", customers.get(2702).getFirstName());
	}

	@Test
	@DisplayName("Record 2703: LastName is Chokshi")
	void LastNameOfRecord2703() {
		assertEquals("Chokshi", customers.get(2702).getLastName());
	}

	@Test
	@DisplayName("Record 2703: Company is Dept Of Interior National Park")
	void CompanyOfRecord2703() {
		assertEquals("Dept Of Interior National Park", customers.get(2702).getCompany());
	}

	@Test
	@DisplayName("Record 2703: Address is 16839 S Normandie Ave")
	void AddressOfRecord2703() {
		assertEquals("16839 S Normandie Ave", customers.get(2702).getAddress());
	}

	@Test
	@DisplayName("Record 2703: City is Gardena")
	void CityOfRecord2703() {
		assertEquals("Gardena", customers.get(2702).getCity());
	}

	@Test
	@DisplayName("Record 2703: County is Los Angeles")
	void CountyOfRecord2703() {
		assertEquals("Los Angeles", customers.get(2702).getCounty());
	}

	@Test
	@DisplayName("Record 2703: State is CA")
	void StateOfRecord2703() {
		assertEquals("CA", customers.get(2702).getState());
	}

	@Test
	@DisplayName("Record 2703: ZIP is 90247")
	void ZIPOfRecord2703() {
		assertEquals("90247", customers.get(2702).getZIP());
	}

	@Test
	@DisplayName("Record 2703: Phone is 310-327-5336")
	void PhoneOfRecord2703() {
		assertEquals("310-327-5336", customers.get(2702).getPhone());
	}

	@Test
	@DisplayName("Record 2703: Fax is 310-327-6336")
	void FaxOfRecord2703() {
		assertEquals("310-327-6336", customers.get(2702).getFax());
	}

	@Test
	@DisplayName("Record 2703: Email is reyes@chokshi.com")
	void EmailOfRecord2703() {
		assertEquals("reyes@chokshi.com", customers.get(2702).getEmail());
	}

	@Test
	@DisplayName("Record 2703: Web is http://www.reyeschokshi.com")
	void WebOfRecord2703() {
		assertEquals("http://www.reyeschokshi.com", customers.get(2702).getWeb());
	}
}
