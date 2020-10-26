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

@Tag("41")
class Record_4406 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4406: FirstName is Harriet")
	void FirstNameOfRecord4406() {
		assertEquals("Harriet", customers.get(4405).getFirstName());
	}

	@Test
	@DisplayName("Record 4406: LastName is Popper")
	void LastNameOfRecord4406() {
		assertEquals("Popper", customers.get(4405).getLastName());
	}

	@Test
	@DisplayName("Record 4406: Company is United Shredding Inc")
	void CompanyOfRecord4406() {
		assertEquals("United Shredding Inc", customers.get(4405).getCompany());
	}

	@Test
	@DisplayName("Record 4406: Address is 84 N Main St")
	void AddressOfRecord4406() {
		assertEquals("84 N Main St", customers.get(4405).getAddress());
	}

	@Test
	@DisplayName("Record 4406: City is Fall River")
	void CityOfRecord4406() {
		assertEquals("Fall River", customers.get(4405).getCity());
	}

	@Test
	@DisplayName("Record 4406: County is Bristol")
	void CountyOfRecord4406() {
		assertEquals("Bristol", customers.get(4405).getCounty());
	}

	@Test
	@DisplayName("Record 4406: State is MA")
	void StateOfRecord4406() {
		assertEquals("MA", customers.get(4405).getState());
	}

	@Test
	@DisplayName("Record 4406: ZIP is 2720")
	void ZIPOfRecord4406() {
		assertEquals("2720", customers.get(4405).getZIP());
	}

	@Test
	@DisplayName("Record 4406: Phone is 508-677-8505")
	void PhoneOfRecord4406() {
		assertEquals("508-677-8505", customers.get(4405).getPhone());
	}

	@Test
	@DisplayName("Record 4406: Fax is 508-677-5942")
	void FaxOfRecord4406() {
		assertEquals("508-677-5942", customers.get(4405).getFax());
	}

	@Test
	@DisplayName("Record 4406: Email is harriet@popper.com")
	void EmailOfRecord4406() {
		assertEquals("harriet@popper.com", customers.get(4405).getEmail());
	}

	@Test
	@DisplayName("Record 4406: Web is http://www.harrietpopper.com")
	void WebOfRecord4406() {
		assertEquals("http://www.harrietpopper.com", customers.get(4405).getWeb());
	}
}
