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

@Tag("18")
class Record_216 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 216: FirstName is Alan")
	void FirstNameOfRecord216() {
		assertEquals("Alan", customers.get(215).getFirstName());
	}

	@Test
	@DisplayName("Record 216: LastName is Ulmen")
	void LastNameOfRecord216() {
		assertEquals("Ulmen", customers.get(215).getLastName());
	}

	@Test
	@DisplayName("Record 216: Company is University Of Chicago")
	void CompanyOfRecord216() {
		assertEquals("University Of Chicago", customers.get(215).getCompany());
	}

	@Test
	@DisplayName("Record 216: Address is 2110 Mannix Dr")
	void AddressOfRecord216() {
		assertEquals("2110 Mannix Dr", customers.get(215).getAddress());
	}

	@Test
	@DisplayName("Record 216: City is San Antonio")
	void CityOfRecord216() {
		assertEquals("San Antonio", customers.get(215).getCity());
	}

	@Test
	@DisplayName("Record 216: County is Bexar")
	void CountyOfRecord216() {
		assertEquals("Bexar", customers.get(215).getCounty());
	}

	@Test
	@DisplayName("Record 216: State is TX")
	void StateOfRecord216() {
		assertEquals("TX", customers.get(215).getState());
	}

	@Test
	@DisplayName("Record 216: ZIP is 78217")
	void ZIPOfRecord216() {
		assertEquals("78217", customers.get(215).getZIP());
	}

	@Test
	@DisplayName("Record 216: Phone is 210-824-7805")
	void PhoneOfRecord216() {
		assertEquals("210-824-7805", customers.get(215).getPhone());
	}

	@Test
	@DisplayName("Record 216: Fax is 210-824-9038")
	void FaxOfRecord216() {
		assertEquals("210-824-9038", customers.get(215).getFax());
	}

	@Test
	@DisplayName("Record 216: Email is alan@ulmen.com")
	void EmailOfRecord216() {
		assertEquals("alan@ulmen.com", customers.get(215).getEmail());
	}

	@Test
	@DisplayName("Record 216: Web is http://www.alanulmen.com")
	void WebOfRecord216() {
		assertEquals("http://www.alanulmen.com", customers.get(215).getWeb());
	}
}
