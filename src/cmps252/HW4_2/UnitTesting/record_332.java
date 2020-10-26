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

@Tag("38")
class Record_332 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 332: FirstName is Joy")
	void FirstNameOfRecord332() {
		assertEquals("Joy", customers.get(331).getFirstName());
	}

	@Test
	@DisplayName("Record 332: LastName is Wolaver")
	void LastNameOfRecord332() {
		assertEquals("Wolaver", customers.get(331).getLastName());
	}

	@Test
	@DisplayName("Record 332: Company is Pines & Kessler")
	void CompanyOfRecord332() {
		assertEquals("Pines & Kessler", customers.get(331).getCompany());
	}

	@Test
	@DisplayName("Record 332: Address is 9777 Harwin Dr")
	void AddressOfRecord332() {
		assertEquals("9777 Harwin Dr", customers.get(331).getAddress());
	}

	@Test
	@DisplayName("Record 332: City is Houston")
	void CityOfRecord332() {
		assertEquals("Houston", customers.get(331).getCity());
	}

	@Test
	@DisplayName("Record 332: County is Harris")
	void CountyOfRecord332() {
		assertEquals("Harris", customers.get(331).getCounty());
	}

	@Test
	@DisplayName("Record 332: State is TX")
	void StateOfRecord332() {
		assertEquals("TX", customers.get(331).getState());
	}

	@Test
	@DisplayName("Record 332: ZIP is 77036")
	void ZIPOfRecord332() {
		assertEquals("77036", customers.get(331).getZIP());
	}

	@Test
	@DisplayName("Record 332: Phone is 713-972-7538")
	void PhoneOfRecord332() {
		assertEquals("713-972-7538", customers.get(331).getPhone());
	}

	@Test
	@DisplayName("Record 332: Fax is 713-972-3434")
	void FaxOfRecord332() {
		assertEquals("713-972-3434", customers.get(331).getFax());
	}

	@Test
	@DisplayName("Record 332: Email is joy@wolaver.com")
	void EmailOfRecord332() {
		assertEquals("joy@wolaver.com", customers.get(331).getEmail());
	}

	@Test
	@DisplayName("Record 332: Web is http://www.joywolaver.com")
	void WebOfRecord332() {
		assertEquals("http://www.joywolaver.com", customers.get(331).getWeb());
	}
}
