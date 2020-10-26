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

@Tag("32")
class Record_2713 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2713: FirstName is Alene")
	void FirstNameOfRecord2713() {
		assertEquals("Alene", customers.get(2712).getFirstName());
	}

	@Test
	@DisplayName("Record 2713: LastName is Siewert")
	void LastNameOfRecord2713() {
		assertEquals("Siewert", customers.get(2712).getLastName());
	}

	@Test
	@DisplayName("Record 2713: Company is Hamilton Adams Imports")
	void CompanyOfRecord2713() {
		assertEquals("Hamilton Adams Imports", customers.get(2712).getCompany());
	}

	@Test
	@DisplayName("Record 2713: Address is 101 Elm Ave")
	void AddressOfRecord2713() {
		assertEquals("101 Elm Ave", customers.get(2712).getAddress());
	}

	@Test
	@DisplayName("Record 2713: City is North Wales")
	void CityOfRecord2713() {
		assertEquals("North Wales", customers.get(2712).getCity());
	}

	@Test
	@DisplayName("Record 2713: County is Montgomery")
	void CountyOfRecord2713() {
		assertEquals("Montgomery", customers.get(2712).getCounty());
	}

	@Test
	@DisplayName("Record 2713: State is PA")
	void StateOfRecord2713() {
		assertEquals("PA", customers.get(2712).getState());
	}

	@Test
	@DisplayName("Record 2713: ZIP is 19454")
	void ZIPOfRecord2713() {
		assertEquals("19454", customers.get(2712).getZIP());
	}

	@Test
	@DisplayName("Record 2713: Phone is 215-699-3132")
	void PhoneOfRecord2713() {
		assertEquals("215-699-3132", customers.get(2712).getPhone());
	}

	@Test
	@DisplayName("Record 2713: Fax is 215-699-5373")
	void FaxOfRecord2713() {
		assertEquals("215-699-5373", customers.get(2712).getFax());
	}

	@Test
	@DisplayName("Record 2713: Email is alene@siewert.com")
	void EmailOfRecord2713() {
		assertEquals("alene@siewert.com", customers.get(2712).getEmail());
	}

	@Test
	@DisplayName("Record 2713: Web is http://www.alenesiewert.com")
	void WebOfRecord2713() {
		assertEquals("http://www.alenesiewert.com", customers.get(2712).getWeb());
	}
}
