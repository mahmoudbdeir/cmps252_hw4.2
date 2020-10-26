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

@Tag("46")
class Record_3041 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3041: FirstName is Bennie")
	void FirstNameOfRecord3041() {
		assertEquals("Bennie", customers.get(3040).getFirstName());
	}

	@Test
	@DisplayName("Record 3041: LastName is Mapa")
	void LastNameOfRecord3041() {
		assertEquals("Mapa", customers.get(3040).getLastName());
	}

	@Test
	@DisplayName("Record 3041: Company is Lithocraft Inc")
	void CompanyOfRecord3041() {
		assertEquals("Lithocraft Inc", customers.get(3040).getCompany());
	}

	@Test
	@DisplayName("Record 3041: Address is 8808 E Admiral Pl")
	void AddressOfRecord3041() {
		assertEquals("8808 E Admiral Pl", customers.get(3040).getAddress());
	}

	@Test
	@DisplayName("Record 3041: City is Tulsa")
	void CityOfRecord3041() {
		assertEquals("Tulsa", customers.get(3040).getCity());
	}

	@Test
	@DisplayName("Record 3041: County is Tulsa")
	void CountyOfRecord3041() {
		assertEquals("Tulsa", customers.get(3040).getCounty());
	}

	@Test
	@DisplayName("Record 3041: State is OK")
	void StateOfRecord3041() {
		assertEquals("OK", customers.get(3040).getState());
	}

	@Test
	@DisplayName("Record 3041: ZIP is 74115")
	void ZIPOfRecord3041() {
		assertEquals("74115", customers.get(3040).getZIP());
	}

	@Test
	@DisplayName("Record 3041: Phone is 918-838-2966")
	void PhoneOfRecord3041() {
		assertEquals("918-838-2966", customers.get(3040).getPhone());
	}

	@Test
	@DisplayName("Record 3041: Fax is 918-838-5021")
	void FaxOfRecord3041() {
		assertEquals("918-838-5021", customers.get(3040).getFax());
	}

	@Test
	@DisplayName("Record 3041: Email is bennie@mapa.com")
	void EmailOfRecord3041() {
		assertEquals("bennie@mapa.com", customers.get(3040).getEmail());
	}

	@Test
	@DisplayName("Record 3041: Web is http://www.benniemapa.com")
	void WebOfRecord3041() {
		assertEquals("http://www.benniemapa.com", customers.get(3040).getWeb());
	}
}
