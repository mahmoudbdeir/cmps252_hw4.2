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

@Tag("6")
class Record_2779 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2779: FirstName is Emma")
	void FirstNameOfRecord2779() {
		assertEquals("Emma", customers.get(2778).getFirstName());
	}

	@Test
	@DisplayName("Record 2779: LastName is Huberman")
	void LastNameOfRecord2779() {
		assertEquals("Huberman", customers.get(2778).getLastName());
	}

	@Test
	@DisplayName("Record 2779: Company is Fischer Packing Co")
	void CompanyOfRecord2779() {
		assertEquals("Fischer Packing Co", customers.get(2778).getCompany());
	}

	@Test
	@DisplayName("Record 2779: Address is 2425 S Hiawassee Rd")
	void AddressOfRecord2779() {
		assertEquals("2425 S Hiawassee Rd", customers.get(2778).getAddress());
	}

	@Test
	@DisplayName("Record 2779: City is Orlando")
	void CityOfRecord2779() {
		assertEquals("Orlando", customers.get(2778).getCity());
	}

	@Test
	@DisplayName("Record 2779: County is Orange")
	void CountyOfRecord2779() {
		assertEquals("Orange", customers.get(2778).getCounty());
	}

	@Test
	@DisplayName("Record 2779: State is FL")
	void StateOfRecord2779() {
		assertEquals("FL", customers.get(2778).getState());
	}

	@Test
	@DisplayName("Record 2779: ZIP is 32835")
	void ZIPOfRecord2779() {
		assertEquals("32835", customers.get(2778).getZIP());
	}

	@Test
	@DisplayName("Record 2779: Phone is 407-296-6317")
	void PhoneOfRecord2779() {
		assertEquals("407-296-6317", customers.get(2778).getPhone());
	}

	@Test
	@DisplayName("Record 2779: Fax is 407-296-9588")
	void FaxOfRecord2779() {
		assertEquals("407-296-9588", customers.get(2778).getFax());
	}

	@Test
	@DisplayName("Record 2779: Email is emma@huberman.com")
	void EmailOfRecord2779() {
		assertEquals("emma@huberman.com", customers.get(2778).getEmail());
	}

	@Test
	@DisplayName("Record 2779: Web is http://www.emmahuberman.com")
	void WebOfRecord2779() {
		assertEquals("http://www.emmahuberman.com", customers.get(2778).getWeb());
	}
}
