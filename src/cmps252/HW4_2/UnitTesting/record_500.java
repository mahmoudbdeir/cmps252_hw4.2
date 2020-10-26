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

@Tag("25")
class Record_500 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 500: FirstName is Abraham")
	void FirstNameOfRecord500() {
		assertEquals("Abraham", customers.get(499).getFirstName());
	}

	@Test
	@DisplayName("Record 500: LastName is Gumphrey")
	void LastNameOfRecord500() {
		assertEquals("Gumphrey", customers.get(499).getLastName());
	}

	@Test
	@DisplayName("Record 500: Company is Calder, Terence L Esq")
	void CompanyOfRecord500() {
		assertEquals("Calder, Terence L Esq", customers.get(499).getCompany());
	}

	@Test
	@DisplayName("Record 500: Address is 203 S Aven  #-d")
	void AddressOfRecord500() {
		assertEquals("203 S Aven  #-d", customers.get(499).getAddress());
	}

	@Test
	@DisplayName("Record 500: City is Clifton")
	void CityOfRecord500() {
		assertEquals("Clifton", customers.get(499).getCity());
	}

	@Test
	@DisplayName("Record 500: County is Bosque")
	void CountyOfRecord500() {
		assertEquals("Bosque", customers.get(499).getCounty());
	}

	@Test
	@DisplayName("Record 500: State is TX")
	void StateOfRecord500() {
		assertEquals("TX", customers.get(499).getState());
	}

	@Test
	@DisplayName("Record 500: ZIP is 76634")
	void ZIPOfRecord500() {
		assertEquals("76634", customers.get(499).getZIP());
	}

	@Test
	@DisplayName("Record 500: Phone is 254-675-1620")
	void PhoneOfRecord500() {
		assertEquals("254-675-1620", customers.get(499).getPhone());
	}

	@Test
	@DisplayName("Record 500: Fax is 254-675-1998")
	void FaxOfRecord500() {
		assertEquals("254-675-1998", customers.get(499).getFax());
	}

	@Test
	@DisplayName("Record 500: Email is abraham@gumphrey.com")
	void EmailOfRecord500() {
		assertEquals("abraham@gumphrey.com", customers.get(499).getEmail());
	}

	@Test
	@DisplayName("Record 500: Web is http://www.abrahamgumphrey.com")
	void WebOfRecord500() {
		assertEquals("http://www.abrahamgumphrey.com", customers.get(499).getWeb());
	}
}
