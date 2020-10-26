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

@Tag("3")
class Record_2451 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2451: FirstName is Dianne")
	void FirstNameOfRecord2451() {
		assertEquals("Dianne", customers.get(2450).getFirstName());
	}

	@Test
	@DisplayName("Record 2451: LastName is Palange")
	void LastNameOfRecord2451() {
		assertEquals("Palange", customers.get(2450).getLastName());
	}

	@Test
	@DisplayName("Record 2451: Company is Metallurgical Labs Inc")
	void CompanyOfRecord2451() {
		assertEquals("Metallurgical Labs Inc", customers.get(2450).getCompany());
	}

	@Test
	@DisplayName("Record 2451: Address is 118 W Meadow St")
	void AddressOfRecord2451() {
		assertEquals("118 W Meadow St", customers.get(2450).getAddress());
	}

	@Test
	@DisplayName("Record 2451: City is Leesburg")
	void CityOfRecord2451() {
		assertEquals("Leesburg", customers.get(2450).getCity());
	}

	@Test
	@DisplayName("Record 2451: County is Lake")
	void CountyOfRecord2451() {
		assertEquals("Lake", customers.get(2450).getCounty());
	}

	@Test
	@DisplayName("Record 2451: State is FL")
	void StateOfRecord2451() {
		assertEquals("FL", customers.get(2450).getState());
	}

	@Test
	@DisplayName("Record 2451: ZIP is 34748")
	void ZIPOfRecord2451() {
		assertEquals("34748", customers.get(2450).getZIP());
	}

	@Test
	@DisplayName("Record 2451: Phone is 352-787-8089")
	void PhoneOfRecord2451() {
		assertEquals("352-787-8089", customers.get(2450).getPhone());
	}

	@Test
	@DisplayName("Record 2451: Fax is 352-787-5208")
	void FaxOfRecord2451() {
		assertEquals("352-787-5208", customers.get(2450).getFax());
	}

	@Test
	@DisplayName("Record 2451: Email is dianne@palange.com")
	void EmailOfRecord2451() {
		assertEquals("dianne@palange.com", customers.get(2450).getEmail());
	}

	@Test
	@DisplayName("Record 2451: Web is http://www.diannepalange.com")
	void WebOfRecord2451() {
		assertEquals("http://www.diannepalange.com", customers.get(2450).getWeb());
	}
}
