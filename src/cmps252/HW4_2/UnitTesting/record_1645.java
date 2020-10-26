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
class Record_1645 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1645: FirstName is Antonia")
	void FirstNameOfRecord1645() {
		assertEquals("Antonia", customers.get(1644).getFirstName());
	}

	@Test
	@DisplayName("Record 1645: LastName is Schuchardt")
	void LastNameOfRecord1645() {
		assertEquals("Schuchardt", customers.get(1644).getLastName());
	}

	@Test
	@DisplayName("Record 1645: Company is Klamen, Marvin M Esq")
	void CompanyOfRecord1645() {
		assertEquals("Klamen, Marvin M Esq", customers.get(1644).getCompany());
	}

	@Test
	@DisplayName("Record 1645: Address is 629 Shiloh Pike")
	void AddressOfRecord1645() {
		assertEquals("629 Shiloh Pike", customers.get(1644).getAddress());
	}

	@Test
	@DisplayName("Record 1645: City is Bridgeton")
	void CityOfRecord1645() {
		assertEquals("Bridgeton", customers.get(1644).getCity());
	}

	@Test
	@DisplayName("Record 1645: County is Cumberland")
	void CountyOfRecord1645() {
		assertEquals("Cumberland", customers.get(1644).getCounty());
	}

	@Test
	@DisplayName("Record 1645: State is NJ")
	void StateOfRecord1645() {
		assertEquals("NJ", customers.get(1644).getState());
	}

	@Test
	@DisplayName("Record 1645: ZIP is 8302")
	void ZIPOfRecord1645() {
		assertEquals("8302", customers.get(1644).getZIP());
	}

	@Test
	@DisplayName("Record 1645: Phone is 856-455-8084")
	void PhoneOfRecord1645() {
		assertEquals("856-455-8084", customers.get(1644).getPhone());
	}

	@Test
	@DisplayName("Record 1645: Fax is 856-455-0735")
	void FaxOfRecord1645() {
		assertEquals("856-455-0735", customers.get(1644).getFax());
	}

	@Test
	@DisplayName("Record 1645: Email is antonia@schuchardt.com")
	void EmailOfRecord1645() {
		assertEquals("antonia@schuchardt.com", customers.get(1644).getEmail());
	}

	@Test
	@DisplayName("Record 1645: Web is http://www.antoniaschuchardt.com")
	void WebOfRecord1645() {
		assertEquals("http://www.antoniaschuchardt.com", customers.get(1644).getWeb());
	}
}
