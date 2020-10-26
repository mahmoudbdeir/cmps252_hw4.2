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

@Tag("10")
class Record_144 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 144: FirstName is Rick")
	void FirstNameOfRecord144() {
		assertEquals("Rick", customers.get(143).getFirstName());
	}

	@Test
	@DisplayName("Record 144: LastName is Garbarini")
	void LastNameOfRecord144() {
		assertEquals("Garbarini", customers.get(143).getLastName());
	}

	@Test
	@DisplayName("Record 144: Company is Wapner Newman & Wigrizer")
	void CompanyOfRecord144() {
		assertEquals("Wapner Newman & Wigrizer", customers.get(143).getCompany());
	}

	@Test
	@DisplayName("Record 144: Address is 602 3rd St")
	void AddressOfRecord144() {
		assertEquals("602 3rd St", customers.get(143).getAddress());
	}

	@Test
	@DisplayName("Record 144: City is Hudson")
	void CityOfRecord144() {
		assertEquals("Hudson", customers.get(143).getCity());
	}

	@Test
	@DisplayName("Record 144: County is Saint Croix")
	void CountyOfRecord144() {
		assertEquals("Saint Croix", customers.get(143).getCounty());
	}

	@Test
	@DisplayName("Record 144: State is WI")
	void StateOfRecord144() {
		assertEquals("WI", customers.get(143).getState());
	}

	@Test
	@DisplayName("Record 144: ZIP is 54016")
	void ZIPOfRecord144() {
		assertEquals("54016", customers.get(143).getZIP());
	}

	@Test
	@DisplayName("Record 144: Phone is 715-386-4368")
	void PhoneOfRecord144() {
		assertEquals("715-386-4368", customers.get(143).getPhone());
	}

	@Test
	@DisplayName("Record 144: Fax is 715-386-3822")
	void FaxOfRecord144() {
		assertEquals("715-386-3822", customers.get(143).getFax());
	}

	@Test
	@DisplayName("Record 144: Email is rick@garbarini.com")
	void EmailOfRecord144() {
		assertEquals("rick@garbarini.com", customers.get(143).getEmail());
	}

	@Test
	@DisplayName("Record 144: Web is http://www.rickgarbarini.com")
	void WebOfRecord144() {
		assertEquals("http://www.rickgarbarini.com", customers.get(143).getWeb());
	}
}
