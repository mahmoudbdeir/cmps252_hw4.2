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

@Tag("19")
class Record_2609 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2609: FirstName is Lela")
	void FirstNameOfRecord2609() {
		assertEquals("Lela", customers.get(2608).getFirstName());
	}

	@Test
	@DisplayName("Record 2609: LastName is Witherite")
	void LastNameOfRecord2609() {
		assertEquals("Witherite", customers.get(2608).getLastName());
	}

	@Test
	@DisplayName("Record 2609: Company is Norcal Perlite Co")
	void CompanyOfRecord2609() {
		assertEquals("Norcal Perlite Co", customers.get(2608).getCompany());
	}

	@Test
	@DisplayName("Record 2609: Address is 20 Church St")
	void AddressOfRecord2609() {
		assertEquals("20 Church St", customers.get(2608).getAddress());
	}

	@Test
	@DisplayName("Record 2609: City is Flemington")
	void CityOfRecord2609() {
		assertEquals("Flemington", customers.get(2608).getCity());
	}

	@Test
	@DisplayName("Record 2609: County is Hunterdon")
	void CountyOfRecord2609() {
		assertEquals("Hunterdon", customers.get(2608).getCounty());
	}

	@Test
	@DisplayName("Record 2609: State is NJ")
	void StateOfRecord2609() {
		assertEquals("NJ", customers.get(2608).getState());
	}

	@Test
	@DisplayName("Record 2609: ZIP is 8822")
	void ZIPOfRecord2609() {
		assertEquals("8822", customers.get(2608).getZIP());
	}

	@Test
	@DisplayName("Record 2609: Phone is 908-806-5597")
	void PhoneOfRecord2609() {
		assertEquals("908-806-5597", customers.get(2608).getPhone());
	}

	@Test
	@DisplayName("Record 2609: Fax is 908-806-2228")
	void FaxOfRecord2609() {
		assertEquals("908-806-2228", customers.get(2608).getFax());
	}

	@Test
	@DisplayName("Record 2609: Email is lela@witherite.com")
	void EmailOfRecord2609() {
		assertEquals("lela@witherite.com", customers.get(2608).getEmail());
	}

	@Test
	@DisplayName("Record 2609: Web is http://www.lelawitherite.com")
	void WebOfRecord2609() {
		assertEquals("http://www.lelawitherite.com", customers.get(2608).getWeb());
	}
}
