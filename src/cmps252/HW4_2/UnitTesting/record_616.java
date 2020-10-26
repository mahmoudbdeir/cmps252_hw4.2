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

@Tag("21")
class Record_616 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 616: FirstName is Dee")
	void FirstNameOfRecord616() {
		assertEquals("Dee", customers.get(615).getFirstName());
	}

	@Test
	@DisplayName("Record 616: LastName is Skelly")
	void LastNameOfRecord616() {
		assertEquals("Skelly", customers.get(615).getLastName());
	}

	@Test
	@DisplayName("Record 616: Company is Folding Carton Machinery Co")
	void CompanyOfRecord616() {
		assertEquals("Folding Carton Machinery Co", customers.get(615).getCompany());
	}

	@Test
	@DisplayName("Record 616: Address is 1405 5th Ave")
	void AddressOfRecord616() {
		assertEquals("1405 5th Ave", customers.get(615).getAddress());
	}

	@Test
	@DisplayName("Record 616: City is Moline")
	void CityOfRecord616() {
		assertEquals("Moline", customers.get(615).getCity());
	}

	@Test
	@DisplayName("Record 616: County is Rock Island")
	void CountyOfRecord616() {
		assertEquals("Rock Island", customers.get(615).getCounty());
	}

	@Test
	@DisplayName("Record 616: State is IL")
	void StateOfRecord616() {
		assertEquals("IL", customers.get(615).getState());
	}

	@Test
	@DisplayName("Record 616: ZIP is 61265")
	void ZIPOfRecord616() {
		assertEquals("61265", customers.get(615).getZIP());
	}

	@Test
	@DisplayName("Record 616: Phone is 309-762-9737")
	void PhoneOfRecord616() {
		assertEquals("309-762-9737", customers.get(615).getPhone());
	}

	@Test
	@DisplayName("Record 616: Fax is 309-762-6557")
	void FaxOfRecord616() {
		assertEquals("309-762-6557", customers.get(615).getFax());
	}

	@Test
	@DisplayName("Record 616: Email is dee@skelly.com")
	void EmailOfRecord616() {
		assertEquals("dee@skelly.com", customers.get(615).getEmail());
	}

	@Test
	@DisplayName("Record 616: Web is http://www.deeskelly.com")
	void WebOfRecord616() {
		assertEquals("http://www.deeskelly.com", customers.get(615).getWeb());
	}
}
