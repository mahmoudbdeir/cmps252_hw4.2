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

@Tag("14")
class Record_3143 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3143: FirstName is Alfreda")
	void FirstNameOfRecord3143() {
		assertEquals("Alfreda", customers.get(3142).getFirstName());
	}

	@Test
	@DisplayName("Record 3143: LastName is Schuelke")
	void LastNameOfRecord3143() {
		assertEquals("Schuelke", customers.get(3142).getLastName());
	}

	@Test
	@DisplayName("Record 3143: Company is Di Napoli Pizza And Pasta")
	void CompanyOfRecord3143() {
		assertEquals("Di Napoli Pizza And Pasta", customers.get(3142).getCompany());
	}

	@Test
	@DisplayName("Record 3143: Address is 2220 Center Park Dr")
	void AddressOfRecord3143() {
		assertEquals("2220 Center Park Dr", customers.get(3142).getAddress());
	}

	@Test
	@DisplayName("Record 3143: City is Charlotte")
	void CityOfRecord3143() {
		assertEquals("Charlotte", customers.get(3142).getCity());
	}

	@Test
	@DisplayName("Record 3143: County is Mecklenburg")
	void CountyOfRecord3143() {
		assertEquals("Mecklenburg", customers.get(3142).getCounty());
	}

	@Test
	@DisplayName("Record 3143: State is NC")
	void StateOfRecord3143() {
		assertEquals("NC", customers.get(3142).getState());
	}

	@Test
	@DisplayName("Record 3143: ZIP is 28217")
	void ZIPOfRecord3143() {
		assertEquals("28217", customers.get(3142).getZIP());
	}

	@Test
	@DisplayName("Record 3143: Phone is 704-357-9378")
	void PhoneOfRecord3143() {
		assertEquals("704-357-9378", customers.get(3142).getPhone());
	}

	@Test
	@DisplayName("Record 3143: Fax is 704-357-1893")
	void FaxOfRecord3143() {
		assertEquals("704-357-1893", customers.get(3142).getFax());
	}

	@Test
	@DisplayName("Record 3143: Email is alfreda@schuelke.com")
	void EmailOfRecord3143() {
		assertEquals("alfreda@schuelke.com", customers.get(3142).getEmail());
	}

	@Test
	@DisplayName("Record 3143: Web is http://www.alfredaschuelke.com")
	void WebOfRecord3143() {
		assertEquals("http://www.alfredaschuelke.com", customers.get(3142).getWeb());
	}
}
