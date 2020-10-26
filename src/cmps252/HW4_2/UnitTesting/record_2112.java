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

@Tag("10")
class Record_2112 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2112: FirstName is Reed")
	void FirstNameOfRecord2112() {
		assertEquals("Reed", customers.get(2111).getFirstName());
	}

	@Test
	@DisplayName("Record 2112: LastName is Silvio")
	void LastNameOfRecord2112() {
		assertEquals("Silvio", customers.get(2111).getLastName());
	}

	@Test
	@DisplayName("Record 2112: Company is Lenox Savings Bank")
	void CompanyOfRecord2112() {
		assertEquals("Lenox Savings Bank", customers.get(2111).getCompany());
	}

	@Test
	@DisplayName("Record 2112: Address is 1537 4th St")
	void AddressOfRecord2112() {
		assertEquals("1537 4th St", customers.get(2111).getAddress());
	}

	@Test
	@DisplayName("Record 2112: City is San Rafael")
	void CityOfRecord2112() {
		assertEquals("San Rafael", customers.get(2111).getCity());
	}

	@Test
	@DisplayName("Record 2112: County is Marin")
	void CountyOfRecord2112() {
		assertEquals("Marin", customers.get(2111).getCounty());
	}

	@Test
	@DisplayName("Record 2112: State is CA")
	void StateOfRecord2112() {
		assertEquals("CA", customers.get(2111).getState());
	}

	@Test
	@DisplayName("Record 2112: ZIP is 94901")
	void ZIPOfRecord2112() {
		assertEquals("94901", customers.get(2111).getZIP());
	}

	@Test
	@DisplayName("Record 2112: Phone is 415-459-6928")
	void PhoneOfRecord2112() {
		assertEquals("415-459-6928", customers.get(2111).getPhone());
	}

	@Test
	@DisplayName("Record 2112: Fax is 415-459-6105")
	void FaxOfRecord2112() {
		assertEquals("415-459-6105", customers.get(2111).getFax());
	}

	@Test
	@DisplayName("Record 2112: Email is reed@silvio.com")
	void EmailOfRecord2112() {
		assertEquals("reed@silvio.com", customers.get(2111).getEmail());
	}

	@Test
	@DisplayName("Record 2112: Web is http://www.reedsilvio.com")
	void WebOfRecord2112() {
		assertEquals("http://www.reedsilvio.com", customers.get(2111).getWeb());
	}
}
