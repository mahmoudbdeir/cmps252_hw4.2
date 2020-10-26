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

@Tag("41")
class Record_2677 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2677: FirstName is Marylou")
	void FirstNameOfRecord2677() {
		assertEquals("Marylou", customers.get(2676).getFirstName());
	}

	@Test
	@DisplayName("Record 2677: LastName is Showes")
	void LastNameOfRecord2677() {
		assertEquals("Showes", customers.get(2676).getLastName());
	}

	@Test
	@DisplayName("Record 2677: Company is Gulf Stream Paints")
	void CompanyOfRecord2677() {
		assertEquals("Gulf Stream Paints", customers.get(2676).getCompany());
	}

	@Test
	@DisplayName("Record 2677: Address is 159 Main St")
	void AddressOfRecord2677() {
		assertEquals("159 Main St", customers.get(2676).getAddress());
	}

	@Test
	@DisplayName("Record 2677: City is Staten Island")
	void CityOfRecord2677() {
		assertEquals("Staten Island", customers.get(2676).getCity());
	}

	@Test
	@DisplayName("Record 2677: County is Richmond")
	void CountyOfRecord2677() {
		assertEquals("Richmond", customers.get(2676).getCounty());
	}

	@Test
	@DisplayName("Record 2677: State is NY")
	void StateOfRecord2677() {
		assertEquals("NY", customers.get(2676).getState());
	}

	@Test
	@DisplayName("Record 2677: ZIP is 10307")
	void ZIPOfRecord2677() {
		assertEquals("10307", customers.get(2676).getZIP());
	}

	@Test
	@DisplayName("Record 2677: Phone is 718-317-5503")
	void PhoneOfRecord2677() {
		assertEquals("718-317-5503", customers.get(2676).getPhone());
	}

	@Test
	@DisplayName("Record 2677: Fax is 718-317-8035")
	void FaxOfRecord2677() {
		assertEquals("718-317-8035", customers.get(2676).getFax());
	}

	@Test
	@DisplayName("Record 2677: Email is marylou@showes.com")
	void EmailOfRecord2677() {
		assertEquals("marylou@showes.com", customers.get(2676).getEmail());
	}

	@Test
	@DisplayName("Record 2677: Web is http://www.maryloushowes.com")
	void WebOfRecord2677() {
		assertEquals("http://www.maryloushowes.com", customers.get(2676).getWeb());
	}
}
