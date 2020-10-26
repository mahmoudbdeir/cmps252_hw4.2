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

@Tag("0")
class Record_2022 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2022: FirstName is Rebekah")
	void FirstNameOfRecord2022() {
		assertEquals("Rebekah", customers.get(2021).getFirstName());
	}

	@Test
	@DisplayName("Record 2022: LastName is Jaruis")
	void LastNameOfRecord2022() {
		assertEquals("Jaruis", customers.get(2021).getLastName());
	}

	@Test
	@DisplayName("Record 2022: Company is Young Engineers Inc")
	void CompanyOfRecord2022() {
		assertEquals("Young Engineers Inc", customers.get(2021).getCompany());
	}

	@Test
	@DisplayName("Record 2022: Address is 4621 Sw Beaverton Hillsdale Hw")
	void AddressOfRecord2022() {
		assertEquals("4621 Sw Beaverton Hillsdale Hw", customers.get(2021).getAddress());
	}

	@Test
	@DisplayName("Record 2022: City is Portland")
	void CityOfRecord2022() {
		assertEquals("Portland", customers.get(2021).getCity());
	}

	@Test
	@DisplayName("Record 2022: County is Multnomah")
	void CountyOfRecord2022() {
		assertEquals("Multnomah", customers.get(2021).getCounty());
	}

	@Test
	@DisplayName("Record 2022: State is OR")
	void StateOfRecord2022() {
		assertEquals("OR", customers.get(2021).getState());
	}

	@Test
	@DisplayName("Record 2022: ZIP is 97221")
	void ZIPOfRecord2022() {
		assertEquals("97221", customers.get(2021).getZIP());
	}

	@Test
	@DisplayName("Record 2022: Phone is 503-244-5420")
	void PhoneOfRecord2022() {
		assertEquals("503-244-5420", customers.get(2021).getPhone());
	}

	@Test
	@DisplayName("Record 2022: Fax is 503-244-2299")
	void FaxOfRecord2022() {
		assertEquals("503-244-2299", customers.get(2021).getFax());
	}

	@Test
	@DisplayName("Record 2022: Email is rebekah@jaruis.com")
	void EmailOfRecord2022() {
		assertEquals("rebekah@jaruis.com", customers.get(2021).getEmail());
	}

	@Test
	@DisplayName("Record 2022: Web is http://www.rebekahjaruis.com")
	void WebOfRecord2022() {
		assertEquals("http://www.rebekahjaruis.com", customers.get(2021).getWeb());
	}
}
