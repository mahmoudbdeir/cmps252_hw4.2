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

@Tag("9")
class Record_3535 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3535: FirstName is Michael")
	void FirstNameOfRecord3535() {
		assertEquals("Michael", customers.get(3534).getFirstName());
	}

	@Test
	@DisplayName("Record 3535: LastName is Airhart")
	void LastNameOfRecord3535() {
		assertEquals("Airhart", customers.get(3534).getLastName());
	}

	@Test
	@DisplayName("Record 3535: Company is Arkansas Methodist Hospital")
	void CompanyOfRecord3535() {
		assertEquals("Arkansas Methodist Hospital", customers.get(3534).getCompany());
	}

	@Test
	@DisplayName("Record 3535: Address is 1517 16th St Sw")
	void AddressOfRecord3535() {
		assertEquals("1517 16th St Sw", customers.get(3534).getAddress());
	}

	@Test
	@DisplayName("Record 3535: City is Rochester")
	void CityOfRecord3535() {
		assertEquals("Rochester", customers.get(3534).getCity());
	}

	@Test
	@DisplayName("Record 3535: County is Olmsted")
	void CountyOfRecord3535() {
		assertEquals("Olmsted", customers.get(3534).getCounty());
	}

	@Test
	@DisplayName("Record 3535: State is MN")
	void StateOfRecord3535() {
		assertEquals("MN", customers.get(3534).getState());
	}

	@Test
	@DisplayName("Record 3535: ZIP is 55902")
	void ZIPOfRecord3535() {
		assertEquals("55902", customers.get(3534).getZIP());
	}

	@Test
	@DisplayName("Record 3535: Phone is 507-289-9769")
	void PhoneOfRecord3535() {
		assertEquals("507-289-9769", customers.get(3534).getPhone());
	}

	@Test
	@DisplayName("Record 3535: Fax is 507-289-8752")
	void FaxOfRecord3535() {
		assertEquals("507-289-8752", customers.get(3534).getFax());
	}

	@Test
	@DisplayName("Record 3535: Email is michael@airhart.com")
	void EmailOfRecord3535() {
		assertEquals("michael@airhart.com", customers.get(3534).getEmail());
	}

	@Test
	@DisplayName("Record 3535: Web is http://www.michaelairhart.com")
	void WebOfRecord3535() {
		assertEquals("http://www.michaelairhart.com", customers.get(3534).getWeb());
	}
}
