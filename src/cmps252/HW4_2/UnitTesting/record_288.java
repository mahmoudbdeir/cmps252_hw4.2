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

@Tag("48")
class Record_288 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 288: FirstName is Michele")
	void FirstNameOfRecord288() {
		assertEquals("Michele", customers.get(287).getFirstName());
	}

	@Test
	@DisplayName("Record 288: LastName is Landford")
	void LastNameOfRecord288() {
		assertEquals("Landford", customers.get(287).getLastName());
	}

	@Test
	@DisplayName("Record 288: Company is Custom Fold Doors Inc")
	void CompanyOfRecord288() {
		assertEquals("Custom Fold Doors Inc", customers.get(287).getCompany());
	}

	@Test
	@DisplayName("Record 288: Address is 1160 Dexter St")
	void AddressOfRecord288() {
		assertEquals("1160 Dexter St", customers.get(287).getAddress());
	}

	@Test
	@DisplayName("Record 288: City is Milan")
	void CityOfRecord288() {
		assertEquals("Milan", customers.get(287).getCity());
	}

	@Test
	@DisplayName("Record 288: County is Monroe")
	void CountyOfRecord288() {
		assertEquals("Monroe", customers.get(287).getCounty());
	}

	@Test
	@DisplayName("Record 288: State is MI")
	void StateOfRecord288() {
		assertEquals("MI", customers.get(287).getState());
	}

	@Test
	@DisplayName("Record 288: ZIP is 48160")
	void ZIPOfRecord288() {
		assertEquals("48160", customers.get(287).getZIP());
	}

	@Test
	@DisplayName("Record 288: Phone is 734-439-0343")
	void PhoneOfRecord288() {
		assertEquals("734-439-0343", customers.get(287).getPhone());
	}

	@Test
	@DisplayName("Record 288: Fax is 734-439-2237")
	void FaxOfRecord288() {
		assertEquals("734-439-2237", customers.get(287).getFax());
	}

	@Test
	@DisplayName("Record 288: Email is michele@landford.com")
	void EmailOfRecord288() {
		assertEquals("michele@landford.com", customers.get(287).getEmail());
	}

	@Test
	@DisplayName("Record 288: Web is http://www.michelelandford.com")
	void WebOfRecord288() {
		assertEquals("http://www.michelelandford.com", customers.get(287).getWeb());
	}
}
