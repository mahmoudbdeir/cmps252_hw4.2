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

@Tag("34")
class Record_3112 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3112: FirstName is Brett")
	void FirstNameOfRecord3112() {
		assertEquals("Brett", customers.get(3111).getFirstName());
	}

	@Test
	@DisplayName("Record 3112: LastName is Branciforte")
	void LastNameOfRecord3112() {
		assertEquals("Branciforte", customers.get(3111).getLastName());
	}

	@Test
	@DisplayName("Record 3112: Company is Century 21 Gaev Realtors")
	void CompanyOfRecord3112() {
		assertEquals("Century 21 Gaev Realtors", customers.get(3111).getCompany());
	}

	@Test
	@DisplayName("Record 3112: Address is 622 Commerce St")
	void AddressOfRecord3112() {
		assertEquals("622 Commerce St", customers.get(3111).getAddress());
	}

	@Test
	@DisplayName("Record 3112: City is Bluefield")
	void CityOfRecord3112() {
		assertEquals("Bluefield", customers.get(3111).getCity());
	}

	@Test
	@DisplayName("Record 3112: County is Mercer")
	void CountyOfRecord3112() {
		assertEquals("Mercer", customers.get(3111).getCounty());
	}

	@Test
	@DisplayName("Record 3112: State is WV")
	void StateOfRecord3112() {
		assertEquals("WV", customers.get(3111).getState());
	}

	@Test
	@DisplayName("Record 3112: ZIP is 24701")
	void ZIPOfRecord3112() {
		assertEquals("24701", customers.get(3111).getZIP());
	}

	@Test
	@DisplayName("Record 3112: Phone is 304-325-8043")
	void PhoneOfRecord3112() {
		assertEquals("304-325-8043", customers.get(3111).getPhone());
	}

	@Test
	@DisplayName("Record 3112: Fax is 304-325-3141")
	void FaxOfRecord3112() {
		assertEquals("304-325-3141", customers.get(3111).getFax());
	}

	@Test
	@DisplayName("Record 3112: Email is brett@branciforte.com")
	void EmailOfRecord3112() {
		assertEquals("brett@branciforte.com", customers.get(3111).getEmail());
	}

	@Test
	@DisplayName("Record 3112: Web is http://www.brettbranciforte.com")
	void WebOfRecord3112() {
		assertEquals("http://www.brettbranciforte.com", customers.get(3111).getWeb());
	}
}
