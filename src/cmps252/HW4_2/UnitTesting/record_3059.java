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
class Record_3059 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3059: FirstName is Kate")
	void FirstNameOfRecord3059() {
		assertEquals("Kate", customers.get(3058).getFirstName());
	}

	@Test
	@DisplayName("Record 3059: LastName is Wigelsworth")
	void LastNameOfRecord3059() {
		assertEquals("Wigelsworth", customers.get(3058).getLastName());
	}

	@Test
	@DisplayName("Record 3059: Company is Fe Fine Printg & Dir Mail Svc")
	void CompanyOfRecord3059() {
		assertEquals("Fe Fine Printg & Dir Mail Svc", customers.get(3058).getCompany());
	}

	@Test
	@DisplayName("Record 3059: Address is 5700 Old Seward Hwy")
	void AddressOfRecord3059() {
		assertEquals("5700 Old Seward Hwy", customers.get(3058).getAddress());
	}

	@Test
	@DisplayName("Record 3059: City is Anchorage")
	void CityOfRecord3059() {
		assertEquals("Anchorage", customers.get(3058).getCity());
	}

	@Test
	@DisplayName("Record 3059: County is Anchorage")
	void CountyOfRecord3059() {
		assertEquals("Anchorage", customers.get(3058).getCounty());
	}

	@Test
	@DisplayName("Record 3059: State is AK")
	void StateOfRecord3059() {
		assertEquals("AK", customers.get(3058).getState());
	}

	@Test
	@DisplayName("Record 3059: ZIP is 99518")
	void ZIPOfRecord3059() {
		assertEquals("99518", customers.get(3058).getZIP());
	}

	@Test
	@DisplayName("Record 3059: Phone is 907-561-8996")
	void PhoneOfRecord3059() {
		assertEquals("907-561-8996", customers.get(3058).getPhone());
	}

	@Test
	@DisplayName("Record 3059: Fax is 907-561-5522")
	void FaxOfRecord3059() {
		assertEquals("907-561-5522", customers.get(3058).getFax());
	}

	@Test
	@DisplayName("Record 3059: Email is kate@wigelsworth.com")
	void EmailOfRecord3059() {
		assertEquals("kate@wigelsworth.com", customers.get(3058).getEmail());
	}

	@Test
	@DisplayName("Record 3059: Web is http://www.katewigelsworth.com")
	void WebOfRecord3059() {
		assertEquals("http://www.katewigelsworth.com", customers.get(3058).getWeb());
	}
}
