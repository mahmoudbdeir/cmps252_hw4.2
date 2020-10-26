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

@Tag("7")
class Record_864 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 864: FirstName is Yong")
	void FirstNameOfRecord864() {
		assertEquals("Yong", customers.get(863).getFirstName());
	}

	@Test
	@DisplayName("Record 864: LastName is Gardella")
	void LastNameOfRecord864() {
		assertEquals("Gardella", customers.get(863).getLastName());
	}

	@Test
	@DisplayName("Record 864: Company is Kincaid, John B")
	void CompanyOfRecord864() {
		assertEquals("Kincaid, John B", customers.get(863).getCompany());
	}

	@Test
	@DisplayName("Record 864: Address is 320 E 6th")
	void AddressOfRecord864() {
		assertEquals("320 E 6th", customers.get(863).getAddress());
	}

	@Test
	@DisplayName("Record 864: City is Larned")
	void CityOfRecord864() {
		assertEquals("Larned", customers.get(863).getCity());
	}

	@Test
	@DisplayName("Record 864: County is Pawnee")
	void CountyOfRecord864() {
		assertEquals("Pawnee", customers.get(863).getCounty());
	}

	@Test
	@DisplayName("Record 864: State is KS")
	void StateOfRecord864() {
		assertEquals("KS", customers.get(863).getState());
	}

	@Test
	@DisplayName("Record 864: ZIP is 67550")
	void ZIPOfRecord864() {
		assertEquals("67550", customers.get(863).getZIP());
	}

	@Test
	@DisplayName("Record 864: Phone is 620-285-1064")
	void PhoneOfRecord864() {
		assertEquals("620-285-1064", customers.get(863).getPhone());
	}

	@Test
	@DisplayName("Record 864: Fax is 620-285-8426")
	void FaxOfRecord864() {
		assertEquals("620-285-8426", customers.get(863).getFax());
	}

	@Test
	@DisplayName("Record 864: Email is yong@gardella.com")
	void EmailOfRecord864() {
		assertEquals("yong@gardella.com", customers.get(863).getEmail());
	}

	@Test
	@DisplayName("Record 864: Web is http://www.yonggardella.com")
	void WebOfRecord864() {
		assertEquals("http://www.yonggardella.com", customers.get(863).getWeb());
	}
}
