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

@Tag("8")
class Record_4452 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4452: FirstName is Ernesto")
	void FirstNameOfRecord4452() {
		assertEquals("Ernesto", customers.get(4451).getFirstName());
	}

	@Test
	@DisplayName("Record 4452: LastName is Seedborg")
	void LastNameOfRecord4452() {
		assertEquals("Seedborg", customers.get(4451).getLastName());
	}

	@Test
	@DisplayName("Record 4452: Company is Williams Williams & Lents")
	void CompanyOfRecord4452() {
		assertEquals("Williams Williams & Lents", customers.get(4451).getCompany());
	}

	@Test
	@DisplayName("Record 4452: Address is 302 Jefferson St  #-200")
	void AddressOfRecord4452() {
		assertEquals("302 Jefferson St  #-200", customers.get(4451).getAddress());
	}

	@Test
	@DisplayName("Record 4452: City is Ralygh")
	void CityOfRecord4452() {
		assertEquals("Ralygh", customers.get(4451).getCity());
	}

	@Test
	@DisplayName("Record 4452: County is Wake")
	void CountyOfRecord4452() {
		assertEquals("Wake", customers.get(4451).getCounty());
	}

	@Test
	@DisplayName("Record 4452: State is NC")
	void StateOfRecord4452() {
		assertEquals("NC", customers.get(4451).getState());
	}

	@Test
	@DisplayName("Record 4452: ZIP is 27605")
	void ZIPOfRecord4452() {
		assertEquals("27605", customers.get(4451).getZIP());
	}

	@Test
	@DisplayName("Record 4452: Phone is 919-755-5126")
	void PhoneOfRecord4452() {
		assertEquals("919-755-5126", customers.get(4451).getPhone());
	}

	@Test
	@DisplayName("Record 4452: Fax is 919-755-5488")
	void FaxOfRecord4452() {
		assertEquals("919-755-5488", customers.get(4451).getFax());
	}

	@Test
	@DisplayName("Record 4452: Email is ernesto@seedborg.com")
	void EmailOfRecord4452() {
		assertEquals("ernesto@seedborg.com", customers.get(4451).getEmail());
	}

	@Test
	@DisplayName("Record 4452: Web is http://www.ernestoseedborg.com")
	void WebOfRecord4452() {
		assertEquals("http://www.ernestoseedborg.com", customers.get(4451).getWeb());
	}
}
