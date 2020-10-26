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

@Tag("34")
class Record_3384 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3384: FirstName is Tuan")
	void FirstNameOfRecord3384() {
		assertEquals("Tuan", customers.get(3383).getFirstName());
	}

	@Test
	@DisplayName("Record 3384: LastName is Newball")
	void LastNameOfRecord3384() {
		assertEquals("Newball", customers.get(3383).getLastName());
	}

	@Test
	@DisplayName("Record 3384: Company is Ryan, David J Esq")
	void CompanyOfRecord3384() {
		assertEquals("Ryan, David J Esq", customers.get(3383).getCompany());
	}

	@Test
	@DisplayName("Record 3384: Address is 19749 Dearborn St")
	void AddressOfRecord3384() {
		assertEquals("19749 Dearborn St", customers.get(3383).getAddress());
	}

	@Test
	@DisplayName("Record 3384: City is Chatsworth")
	void CityOfRecord3384() {
		assertEquals("Chatsworth", customers.get(3383).getCity());
	}

	@Test
	@DisplayName("Record 3384: County is Los Angeles")
	void CountyOfRecord3384() {
		assertEquals("Los Angeles", customers.get(3383).getCounty());
	}

	@Test
	@DisplayName("Record 3384: State is CA")
	void StateOfRecord3384() {
		assertEquals("CA", customers.get(3383).getState());
	}

	@Test
	@DisplayName("Record 3384: ZIP is 91311")
	void ZIPOfRecord3384() {
		assertEquals("91311", customers.get(3383).getZIP());
	}

	@Test
	@DisplayName("Record 3384: Phone is 818-718-6794")
	void PhoneOfRecord3384() {
		assertEquals("818-718-6794", customers.get(3383).getPhone());
	}

	@Test
	@DisplayName("Record 3384: Fax is 818-718-8992")
	void FaxOfRecord3384() {
		assertEquals("818-718-8992", customers.get(3383).getFax());
	}

	@Test
	@DisplayName("Record 3384: Email is tuan@newball.com")
	void EmailOfRecord3384() {
		assertEquals("tuan@newball.com", customers.get(3383).getEmail());
	}

	@Test
	@DisplayName("Record 3384: Web is http://www.tuannewball.com")
	void WebOfRecord3384() {
		assertEquals("http://www.tuannewball.com", customers.get(3383).getWeb());
	}
}
