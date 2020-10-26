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

@Tag("16")
class Record_331 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 331: FirstName is Bernard")
	void FirstNameOfRecord331() {
		assertEquals("Bernard", customers.get(330).getFirstName());
	}

	@Test
	@DisplayName("Record 331: LastName is Winley")
	void LastNameOfRecord331() {
		assertEquals("Winley", customers.get(330).getLastName());
	}

	@Test
	@DisplayName("Record 331: Company is Kkiq Fm 101 7")
	void CompanyOfRecord331() {
		assertEquals("Kkiq Fm 101 7", customers.get(330).getCompany());
	}

	@Test
	@DisplayName("Record 331: Address is 9816 Maple St")
	void AddressOfRecord331() {
		assertEquals("9816 Maple St", customers.get(330).getAddress());
	}

	@Test
	@DisplayName("Record 331: City is Bellflower")
	void CityOfRecord331() {
		assertEquals("Bellflower", customers.get(330).getCity());
	}

	@Test
	@DisplayName("Record 331: County is Los Angeles")
	void CountyOfRecord331() {
		assertEquals("Los Angeles", customers.get(330).getCounty());
	}

	@Test
	@DisplayName("Record 331: State is CA")
	void StateOfRecord331() {
		assertEquals("CA", customers.get(330).getState());
	}

	@Test
	@DisplayName("Record 331: ZIP is 90706")
	void ZIPOfRecord331() {
		assertEquals("90706", customers.get(330).getZIP());
	}

	@Test
	@DisplayName("Record 331: Phone is 562-804-3996")
	void PhoneOfRecord331() {
		assertEquals("562-804-3996", customers.get(330).getPhone());
	}

	@Test
	@DisplayName("Record 331: Fax is 562-804-6391")
	void FaxOfRecord331() {
		assertEquals("562-804-6391", customers.get(330).getFax());
	}

	@Test
	@DisplayName("Record 331: Email is bernard@winley.com")
	void EmailOfRecord331() {
		assertEquals("bernard@winley.com", customers.get(330).getEmail());
	}

	@Test
	@DisplayName("Record 331: Web is http://www.bernardwinley.com")
	void WebOfRecord331() {
		assertEquals("http://www.bernardwinley.com", customers.get(330).getWeb());
	}
}
