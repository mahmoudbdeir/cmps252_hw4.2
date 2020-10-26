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

@Tag("4")
class Record_762 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 762: FirstName is Dominick")
	void FirstNameOfRecord762() {
		assertEquals("Dominick", customers.get(761).getFirstName());
	}

	@Test
	@DisplayName("Record 762: LastName is Giesy")
	void LastNameOfRecord762() {
		assertEquals("Giesy", customers.get(761).getLastName());
	}

	@Test
	@DisplayName("Record 762: Company is Tile Emporium Internatl")
	void CompanyOfRecord762() {
		assertEquals("Tile Emporium Internatl", customers.get(761).getCompany());
	}

	@Test
	@DisplayName("Record 762: Address is 300 Tejon Pl")
	void AddressOfRecord762() {
		assertEquals("300 Tejon Pl", customers.get(761).getAddress());
	}

	@Test
	@DisplayName("Record 762: City is Palos Verdes Peninsula")
	void CityOfRecord762() {
		assertEquals("Palos Verdes Peninsula", customers.get(761).getCity());
	}

	@Test
	@DisplayName("Record 762: County is Los Angeles")
	void CountyOfRecord762() {
		assertEquals("Los Angeles", customers.get(761).getCounty());
	}

	@Test
	@DisplayName("Record 762: State is CA")
	void StateOfRecord762() {
		assertEquals("CA", customers.get(761).getState());
	}

	@Test
	@DisplayName("Record 762: ZIP is 90274")
	void ZIPOfRecord762() {
		assertEquals("90274", customers.get(761).getZIP());
	}

	@Test
	@DisplayName("Record 762: Phone is 310-791-7864")
	void PhoneOfRecord762() {
		assertEquals("310-791-7864", customers.get(761).getPhone());
	}

	@Test
	@DisplayName("Record 762: Fax is 310-791-8101")
	void FaxOfRecord762() {
		assertEquals("310-791-8101", customers.get(761).getFax());
	}

	@Test
	@DisplayName("Record 762: Email is dominick@giesy.com")
	void EmailOfRecord762() {
		assertEquals("dominick@giesy.com", customers.get(761).getEmail());
	}

	@Test
	@DisplayName("Record 762: Web is http://www.dominickgiesy.com")
	void WebOfRecord762() {
		assertEquals("http://www.dominickgiesy.com", customers.get(761).getWeb());
	}
}
