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

@Tag("43")
class Record_2126 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2126: FirstName is Jamar")
	void FirstNameOfRecord2126() {
		assertEquals("Jamar", customers.get(2125).getFirstName());
	}

	@Test
	@DisplayName("Record 2126: LastName is Saft")
	void LastNameOfRecord2126() {
		assertEquals("Saft", customers.get(2125).getLastName());
	}

	@Test
	@DisplayName("Record 2126: Company is D L Padgitt & Associates Ltd")
	void CompanyOfRecord2126() {
		assertEquals("D L Padgitt & Associates Ltd", customers.get(2125).getCompany());
	}

	@Test
	@DisplayName("Record 2126: Address is 308 W Hwy 55")
	void AddressOfRecord2126() {
		assertEquals("308 W Hwy 55", customers.get(2125).getAddress());
	}

	@Test
	@DisplayName("Record 2126: City is Maple Lake")
	void CityOfRecord2126() {
		assertEquals("Maple Lake", customers.get(2125).getCity());
	}

	@Test
	@DisplayName("Record 2126: County is Wright")
	void CountyOfRecord2126() {
		assertEquals("Wright", customers.get(2125).getCounty());
	}

	@Test
	@DisplayName("Record 2126: State is MN")
	void StateOfRecord2126() {
		assertEquals("MN", customers.get(2125).getState());
	}

	@Test
	@DisplayName("Record 2126: ZIP is 55358")
	void ZIPOfRecord2126() {
		assertEquals("55358", customers.get(2125).getZIP());
	}

	@Test
	@DisplayName("Record 2126: Phone is 320-963-6199")
	void PhoneOfRecord2126() {
		assertEquals("320-963-6199", customers.get(2125).getPhone());
	}

	@Test
	@DisplayName("Record 2126: Fax is 320-963-9078")
	void FaxOfRecord2126() {
		assertEquals("320-963-9078", customers.get(2125).getFax());
	}

	@Test
	@DisplayName("Record 2126: Email is jamar@saft.com")
	void EmailOfRecord2126() {
		assertEquals("jamar@saft.com", customers.get(2125).getEmail());
	}

	@Test
	@DisplayName("Record 2126: Web is http://www.jamarsaft.com")
	void WebOfRecord2126() {
		assertEquals("http://www.jamarsaft.com", customers.get(2125).getWeb());
	}
}
