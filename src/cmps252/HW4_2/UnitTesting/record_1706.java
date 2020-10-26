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

@Tag("22")
class Record_1706 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1706: FirstName is Elizabeth")
	void FirstNameOfRecord1706() {
		assertEquals("Elizabeth", customers.get(1705).getFirstName());
	}

	@Test
	@DisplayName("Record 1706: LastName is Gerbits")
	void LastNameOfRecord1706() {
		assertEquals("Gerbits", customers.get(1705).getLastName());
	}

	@Test
	@DisplayName("Record 1706: Company is Berman, Richard B Esq")
	void CompanyOfRecord1706() {
		assertEquals("Berman, Richard B Esq", customers.get(1705).getCompany());
	}

	@Test
	@DisplayName("Record 1706: Address is 2753 Port Neal Circ")
	void AddressOfRecord1706() {
		assertEquals("2753 Port Neal Circ", customers.get(1705).getAddress());
	}

	@Test
	@DisplayName("Record 1706: City is Sergeant Bluff")
	void CityOfRecord1706() {
		assertEquals("Sergeant Bluff", customers.get(1705).getCity());
	}

	@Test
	@DisplayName("Record 1706: County is Woodbury")
	void CountyOfRecord1706() {
		assertEquals("Woodbury", customers.get(1705).getCounty());
	}

	@Test
	@DisplayName("Record 1706: State is IA")
	void StateOfRecord1706() {
		assertEquals("IA", customers.get(1705).getState());
	}

	@Test
	@DisplayName("Record 1706: ZIP is 51054")
	void ZIPOfRecord1706() {
		assertEquals("51054", customers.get(1705).getZIP());
	}

	@Test
	@DisplayName("Record 1706: Phone is 712-943-7870")
	void PhoneOfRecord1706() {
		assertEquals("712-943-7870", customers.get(1705).getPhone());
	}

	@Test
	@DisplayName("Record 1706: Fax is 712-943-8085")
	void FaxOfRecord1706() {
		assertEquals("712-943-8085", customers.get(1705).getFax());
	}

	@Test
	@DisplayName("Record 1706: Email is elizabeth@gerbits.com")
	void EmailOfRecord1706() {
		assertEquals("elizabeth@gerbits.com", customers.get(1705).getEmail());
	}

	@Test
	@DisplayName("Record 1706: Web is http://www.elizabethgerbits.com")
	void WebOfRecord1706() {
		assertEquals("http://www.elizabethgerbits.com", customers.get(1705).getWeb());
	}
}
