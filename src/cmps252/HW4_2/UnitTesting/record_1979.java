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

@Tag("37")
class Record_1979 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1979: FirstName is Trey")
	void FirstNameOfRecord1979() {
		assertEquals("Trey", customers.get(1978).getFirstName());
	}

	@Test
	@DisplayName("Record 1979: LastName is Wuerts")
	void LastNameOfRecord1979() {
		assertEquals("Wuerts", customers.get(1978).getLastName());
	}

	@Test
	@DisplayName("Record 1979: Company is Myse, Clyde G Esq")
	void CompanyOfRecord1979() {
		assertEquals("Myse, Clyde G Esq", customers.get(1978).getCompany());
	}

	@Test
	@DisplayName("Record 1979: Address is 4443 Us Highway 50e E")
	void AddressOfRecord1979() {
		assertEquals("4443 Us Highway 50e E", customers.get(1978).getAddress());
	}

	@Test
	@DisplayName("Record 1979: City is Carson City")
	void CityOfRecord1979() {
		assertEquals("Carson City", customers.get(1978).getCity());
	}

	@Test
	@DisplayName("Record 1979: County is Carson City")
	void CountyOfRecord1979() {
		assertEquals("Carson City", customers.get(1978).getCounty());
	}

	@Test
	@DisplayName("Record 1979: State is NV")
	void StateOfRecord1979() {
		assertEquals("NV", customers.get(1978).getState());
	}

	@Test
	@DisplayName("Record 1979: ZIP is 89701")
	void ZIPOfRecord1979() {
		assertEquals("89701", customers.get(1978).getZIP());
	}

	@Test
	@DisplayName("Record 1979: Phone is 775-882-9338")
	void PhoneOfRecord1979() {
		assertEquals("775-882-9338", customers.get(1978).getPhone());
	}

	@Test
	@DisplayName("Record 1979: Fax is 775-882-3967")
	void FaxOfRecord1979() {
		assertEquals("775-882-3967", customers.get(1978).getFax());
	}

	@Test
	@DisplayName("Record 1979: Email is trey@wuerts.com")
	void EmailOfRecord1979() {
		assertEquals("trey@wuerts.com", customers.get(1978).getEmail());
	}

	@Test
	@DisplayName("Record 1979: Web is http://www.treywuerts.com")
	void WebOfRecord1979() {
		assertEquals("http://www.treywuerts.com", customers.get(1978).getWeb());
	}
}
