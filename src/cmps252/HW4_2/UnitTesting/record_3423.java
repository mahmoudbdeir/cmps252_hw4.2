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

@Tag("19")
class Record_3423 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3423: FirstName is Nan")
	void FirstNameOfRecord3423() {
		assertEquals("Nan", customers.get(3422).getFirstName());
	}

	@Test
	@DisplayName("Record 3423: LastName is Poloskey")
	void LastNameOfRecord3423() {
		assertEquals("Poloskey", customers.get(3422).getLastName());
	}

	@Test
	@DisplayName("Record 3423: Company is Equitable")
	void CompanyOfRecord3423() {
		assertEquals("Equitable", customers.get(3422).getCompany());
	}

	@Test
	@DisplayName("Record 3423: Address is 2701 S Bayshore Dr")
	void AddressOfRecord3423() {
		assertEquals("2701 S Bayshore Dr", customers.get(3422).getAddress());
	}

	@Test
	@DisplayName("Record 3423: City is Miami")
	void CityOfRecord3423() {
		assertEquals("Miami", customers.get(3422).getCity());
	}

	@Test
	@DisplayName("Record 3423: County is Miami-Dade")
	void CountyOfRecord3423() {
		assertEquals("Miami-Dade", customers.get(3422).getCounty());
	}

	@Test
	@DisplayName("Record 3423: State is FL")
	void StateOfRecord3423() {
		assertEquals("FL", customers.get(3422).getState());
	}

	@Test
	@DisplayName("Record 3423: ZIP is 33133")
	void ZIPOfRecord3423() {
		assertEquals("33133", customers.get(3422).getZIP());
	}

	@Test
	@DisplayName("Record 3423: Phone is 305-854-2617")
	void PhoneOfRecord3423() {
		assertEquals("305-854-2617", customers.get(3422).getPhone());
	}

	@Test
	@DisplayName("Record 3423: Fax is 305-854-1859")
	void FaxOfRecord3423() {
		assertEquals("305-854-1859", customers.get(3422).getFax());
	}

	@Test
	@DisplayName("Record 3423: Email is nan@poloskey.com")
	void EmailOfRecord3423() {
		assertEquals("nan@poloskey.com", customers.get(3422).getEmail());
	}

	@Test
	@DisplayName("Record 3423: Web is http://www.nanpoloskey.com")
	void WebOfRecord3423() {
		assertEquals("http://www.nanpoloskey.com", customers.get(3422).getWeb());
	}
}
