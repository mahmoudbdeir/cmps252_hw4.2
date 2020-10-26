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

@Tag("16")
class Record_3386 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3386: FirstName is Jewel")
	void FirstNameOfRecord3386() {
		assertEquals("Jewel", customers.get(3385).getFirstName());
	}

	@Test
	@DisplayName("Record 3386: LastName is Guiab")
	void LastNameOfRecord3386() {
		assertEquals("Guiab", customers.get(3385).getLastName());
	}

	@Test
	@DisplayName("Record 3386: Company is Radisson Mart Plz Htl & Cnvntn")
	void CompanyOfRecord3386() {
		assertEquals("Radisson Mart Plz Htl & Cnvntn", customers.get(3385).getCompany());
	}

	@Test
	@DisplayName("Record 3386: Address is 160 Summerfield St")
	void AddressOfRecord3386() {
		assertEquals("160 Summerfield St", customers.get(3385).getAddress());
	}

	@Test
	@DisplayName("Record 3386: City is Scarsdale")
	void CityOfRecord3386() {
		assertEquals("Scarsdale", customers.get(3385).getCity());
	}

	@Test
	@DisplayName("Record 3386: County is Westchester")
	void CountyOfRecord3386() {
		assertEquals("Westchester", customers.get(3385).getCounty());
	}

	@Test
	@DisplayName("Record 3386: State is NY")
	void StateOfRecord3386() {
		assertEquals("NY", customers.get(3385).getState());
	}

	@Test
	@DisplayName("Record 3386: ZIP is 10583")
	void ZIPOfRecord3386() {
		assertEquals("10583", customers.get(3385).getZIP());
	}

	@Test
	@DisplayName("Record 3386: Phone is 914-723-2246")
	void PhoneOfRecord3386() {
		assertEquals("914-723-2246", customers.get(3385).getPhone());
	}

	@Test
	@DisplayName("Record 3386: Fax is 914-723-6969")
	void FaxOfRecord3386() {
		assertEquals("914-723-6969", customers.get(3385).getFax());
	}

	@Test
	@DisplayName("Record 3386: Email is jewel@guiab.com")
	void EmailOfRecord3386() {
		assertEquals("jewel@guiab.com", customers.get(3385).getEmail());
	}

	@Test
	@DisplayName("Record 3386: Web is http://www.jewelguiab.com")
	void WebOfRecord3386() {
		assertEquals("http://www.jewelguiab.com", customers.get(3385).getWeb());
	}
}
