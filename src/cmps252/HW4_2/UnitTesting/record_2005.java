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

@Tag("3")
class Record_2005 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2005: FirstName is Arron")
	void FirstNameOfRecord2005() {
		assertEquals("Arron", customers.get(2004).getFirstName());
	}

	@Test
	@DisplayName("Record 2005: LastName is Shelvin")
	void LastNameOfRecord2005() {
		assertEquals("Shelvin", customers.get(2004).getLastName());
	}

	@Test
	@DisplayName("Record 2005: Company is Leasing Consultants")
	void CompanyOfRecord2005() {
		assertEquals("Leasing Consultants", customers.get(2004).getCompany());
	}

	@Test
	@DisplayName("Record 2005: Address is 57 Grysmere St")
	void AddressOfRecord2005() {
		assertEquals("57 Grysmere St", customers.get(2004).getAddress());
	}

	@Test
	@DisplayName("Record 2005: City is Pittsburgh")
	void CityOfRecord2005() {
		assertEquals("Pittsburgh", customers.get(2004).getCity());
	}

	@Test
	@DisplayName("Record 2005: County is Allegheny")
	void CountyOfRecord2005() {
		assertEquals("Allegheny", customers.get(2004).getCounty());
	}

	@Test
	@DisplayName("Record 2005: State is PA")
	void StateOfRecord2005() {
		assertEquals("PA", customers.get(2004).getState());
	}

	@Test
	@DisplayName("Record 2005: ZIP is 15223")
	void ZIPOfRecord2005() {
		assertEquals("15223", customers.get(2004).getZIP());
	}

	@Test
	@DisplayName("Record 2005: Phone is 412-782-0301")
	void PhoneOfRecord2005() {
		assertEquals("412-782-0301", customers.get(2004).getPhone());
	}

	@Test
	@DisplayName("Record 2005: Fax is 412-782-2808")
	void FaxOfRecord2005() {
		assertEquals("412-782-2808", customers.get(2004).getFax());
	}

	@Test
	@DisplayName("Record 2005: Email is arron@shelvin.com")
	void EmailOfRecord2005() {
		assertEquals("arron@shelvin.com", customers.get(2004).getEmail());
	}

	@Test
	@DisplayName("Record 2005: Web is http://www.arronshelvin.com")
	void WebOfRecord2005() {
		assertEquals("http://www.arronshelvin.com", customers.get(2004).getWeb());
	}
}
