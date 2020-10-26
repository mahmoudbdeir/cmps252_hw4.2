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

@Tag("24")
class Record_3869 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3869: FirstName is Sharon")
	void FirstNameOfRecord3869() {
		assertEquals("Sharon", customers.get(3868).getFirstName());
	}

	@Test
	@DisplayName("Record 3869: LastName is Panetta")
	void LastNameOfRecord3869() {
		assertEquals("Panetta", customers.get(3868).getLastName());
	}

	@Test
	@DisplayName("Record 3869: Company is Composidie Inc")
	void CompanyOfRecord3869() {
		assertEquals("Composidie Inc", customers.get(3868).getCompany());
	}

	@Test
	@DisplayName("Record 3869: Address is 614 Central Ave")
	void AddressOfRecord3869() {
		assertEquals("614 Central Ave", customers.get(3868).getAddress());
	}

	@Test
	@DisplayName("Record 3869: City is East Orange")
	void CityOfRecord3869() {
		assertEquals("East Orange", customers.get(3868).getCity());
	}

	@Test
	@DisplayName("Record 3869: County is Essex")
	void CountyOfRecord3869() {
		assertEquals("Essex", customers.get(3868).getCounty());
	}

	@Test
	@DisplayName("Record 3869: State is NJ")
	void StateOfRecord3869() {
		assertEquals("NJ", customers.get(3868).getState());
	}

	@Test
	@DisplayName("Record 3869: ZIP is 07018")
	void ZIPOfRecord3869() {
		assertEquals("07018", customers.get(3868).getZIP());
	}

	@Test
	@DisplayName("Record 3869: Phone is 973-672-0096")
	void PhoneOfRecord3869() {
		assertEquals("973-672-0096", customers.get(3868).getPhone());
	}

	@Test
	@DisplayName("Record 3869: Fax is 973-672-4389")
	void FaxOfRecord3869() {
		assertEquals("973-672-4389", customers.get(3868).getFax());
	}

	@Test
	@DisplayName("Record 3869: Email is sharon@panetta.com")
	void EmailOfRecord3869() {
		assertEquals("sharon@panetta.com", customers.get(3868).getEmail());
	}

	@Test
	@DisplayName("Record 3869: Web is http://www.sharonpanetta.com")
	void WebOfRecord3869() {
		assertEquals("http://www.sharonpanetta.com", customers.get(3868).getWeb());
	}
}
