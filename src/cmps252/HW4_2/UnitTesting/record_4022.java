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
class Record_4022 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4022: FirstName is Johnathon")
	void FirstNameOfRecord4022() {
		assertEquals("Johnathon", customers.get(4021).getFirstName());
	}

	@Test
	@DisplayName("Record 4022: LastName is Matyi")
	void LastNameOfRecord4022() {
		assertEquals("Matyi", customers.get(4021).getLastName());
	}

	@Test
	@DisplayName("Record 4022: Company is Rice, George A Esq")
	void CompanyOfRecord4022() {
		assertEquals("Rice, George A Esq", customers.get(4021).getCompany());
	}

	@Test
	@DisplayName("Record 4022: Address is 1274 N 2nd St")
	void AddressOfRecord4022() {
		assertEquals("1274 N 2nd St", customers.get(4021).getAddress());
	}

	@Test
	@DisplayName("Record 4022: City is Abilene")
	void CityOfRecord4022() {
		assertEquals("Abilene", customers.get(4021).getCity());
	}

	@Test
	@DisplayName("Record 4022: County is Taylor")
	void CountyOfRecord4022() {
		assertEquals("Taylor", customers.get(4021).getCounty());
	}

	@Test
	@DisplayName("Record 4022: State is TX")
	void StateOfRecord4022() {
		assertEquals("TX", customers.get(4021).getState());
	}

	@Test
	@DisplayName("Record 4022: ZIP is 79601")
	void ZIPOfRecord4022() {
		assertEquals("79601", customers.get(4021).getZIP());
	}

	@Test
	@DisplayName("Record 4022: Phone is 325-675-2153")
	void PhoneOfRecord4022() {
		assertEquals("325-675-2153", customers.get(4021).getPhone());
	}

	@Test
	@DisplayName("Record 4022: Fax is 325-675-3821")
	void FaxOfRecord4022() {
		assertEquals("325-675-3821", customers.get(4021).getFax());
	}

	@Test
	@DisplayName("Record 4022: Email is johnathon@matyi.com")
	void EmailOfRecord4022() {
		assertEquals("johnathon@matyi.com", customers.get(4021).getEmail());
	}

	@Test
	@DisplayName("Record 4022: Web is http://www.johnathonmatyi.com")
	void WebOfRecord4022() {
		assertEquals("http://www.johnathonmatyi.com", customers.get(4021).getWeb());
	}
}
