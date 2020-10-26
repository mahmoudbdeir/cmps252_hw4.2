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

@Tag("30")
class Record_3832 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3832: FirstName is Claudette")
	void FirstNameOfRecord3832() {
		assertEquals("Claudette", customers.get(3831).getFirstName());
	}

	@Test
	@DisplayName("Record 3832: LastName is Kwiecien")
	void LastNameOfRecord3832() {
		assertEquals("Kwiecien", customers.get(3831).getLastName());
	}

	@Test
	@DisplayName("Record 3832: Company is M C Aerospace Corporation")
	void CompanyOfRecord3832() {
		assertEquals("M C Aerospace Corporation", customers.get(3831).getCompany());
	}

	@Test
	@DisplayName("Record 3832: Address is 1890 Flanagan Ave")
	void AddressOfRecord3832() {
		assertEquals("1890 Flanagan Ave", customers.get(3831).getAddress());
	}

	@Test
	@DisplayName("Record 3832: City is Williamstown")
	void CityOfRecord3832() {
		assertEquals("Williamstown", customers.get(3831).getCity());
	}

	@Test
	@DisplayName("Record 3832: County is Gloucester")
	void CountyOfRecord3832() {
		assertEquals("Gloucester", customers.get(3831).getCounty());
	}

	@Test
	@DisplayName("Record 3832: State is NJ")
	void StateOfRecord3832() {
		assertEquals("NJ", customers.get(3831).getState());
	}

	@Test
	@DisplayName("Record 3832: ZIP is 8094")
	void ZIPOfRecord3832() {
		assertEquals("8094", customers.get(3831).getZIP());
	}

	@Test
	@DisplayName("Record 3832: Phone is 856-863-8521")
	void PhoneOfRecord3832() {
		assertEquals("856-863-8521", customers.get(3831).getPhone());
	}

	@Test
	@DisplayName("Record 3832: Fax is 856-863-8111")
	void FaxOfRecord3832() {
		assertEquals("856-863-8111", customers.get(3831).getFax());
	}

	@Test
	@DisplayName("Record 3832: Email is claudette@kwiecien.com")
	void EmailOfRecord3832() {
		assertEquals("claudette@kwiecien.com", customers.get(3831).getEmail());
	}

	@Test
	@DisplayName("Record 3832: Web is http://www.claudettekwiecien.com")
	void WebOfRecord3832() {
		assertEquals("http://www.claudettekwiecien.com", customers.get(3831).getWeb());
	}
}
