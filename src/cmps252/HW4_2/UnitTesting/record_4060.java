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

@Tag("8")
class Record_4060 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4060: FirstName is Doreen")
	void FirstNameOfRecord4060() {
		assertEquals("Doreen", customers.get(4059).getFirstName());
	}

	@Test
	@DisplayName("Record 4060: LastName is Melikyan")
	void LastNameOfRecord4060() {
		assertEquals("Melikyan", customers.get(4059).getLastName());
	}

	@Test
	@DisplayName("Record 4060: Company is Philadelphia Ship Prsrvtn Gld")
	void CompanyOfRecord4060() {
		assertEquals("Philadelphia Ship Prsrvtn Gld", customers.get(4059).getCompany());
	}

	@Test
	@DisplayName("Record 4060: Address is 543 W Broadway")
	void AddressOfRecord4060() {
		assertEquals("543 W Broadway", customers.get(4059).getAddress());
	}

	@Test
	@DisplayName("Record 4060: City is Trenton")
	void CityOfRecord4060() {
		assertEquals("Trenton", customers.get(4059).getCity());
	}

	@Test
	@DisplayName("Record 4060: County is Clinton")
	void CountyOfRecord4060() {
		assertEquals("Clinton", customers.get(4059).getCounty());
	}

	@Test
	@DisplayName("Record 4060: State is IL")
	void StateOfRecord4060() {
		assertEquals("IL", customers.get(4059).getState());
	}

	@Test
	@DisplayName("Record 4060: ZIP is 62293")
	void ZIPOfRecord4060() {
		assertEquals("62293", customers.get(4059).getZIP());
	}

	@Test
	@DisplayName("Record 4060: Phone is 618-224-4388")
	void PhoneOfRecord4060() {
		assertEquals("618-224-4388", customers.get(4059).getPhone());
	}

	@Test
	@DisplayName("Record 4060: Fax is 618-224-5016")
	void FaxOfRecord4060() {
		assertEquals("618-224-5016", customers.get(4059).getFax());
	}

	@Test
	@DisplayName("Record 4060: Email is doreen@melikyan.com")
	void EmailOfRecord4060() {
		assertEquals("doreen@melikyan.com", customers.get(4059).getEmail());
	}

	@Test
	@DisplayName("Record 4060: Web is http://www.doreenmelikyan.com")
	void WebOfRecord4060() {
		assertEquals("http://www.doreenmelikyan.com", customers.get(4059).getWeb());
	}
}
