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

@Tag("47")
class Record_1073 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1073: FirstName is Shyla")
	void FirstNameOfRecord1073() {
		assertEquals("Shyla", customers.get(1072).getFirstName());
	}

	@Test
	@DisplayName("Record 1073: LastName is Hartsook")
	void LastNameOfRecord1073() {
		assertEquals("Hartsook", customers.get(1072).getLastName());
	}

	@Test
	@DisplayName("Record 1073: Company is Sheehan, Edward D Esq")
	void CompanyOfRecord1073() {
		assertEquals("Sheehan, Edward D Esq", customers.get(1072).getCompany());
	}

	@Test
	@DisplayName("Record 1073: Address is Box #-527")
	void AddressOfRecord1073() {
		assertEquals("Box #-527", customers.get(1072).getAddress());
	}

	@Test
	@DisplayName("Record 1073: City is Yuba City")
	void CityOfRecord1073() {
		assertEquals("Yuba City", customers.get(1072).getCity());
	}

	@Test
	@DisplayName("Record 1073: County is Sutter")
	void CountyOfRecord1073() {
		assertEquals("Sutter", customers.get(1072).getCounty());
	}

	@Test
	@DisplayName("Record 1073: State is CA")
	void StateOfRecord1073() {
		assertEquals("CA", customers.get(1072).getState());
	}

	@Test
	@DisplayName("Record 1073: ZIP is 95992")
	void ZIPOfRecord1073() {
		assertEquals("95992", customers.get(1072).getZIP());
	}

	@Test
	@DisplayName("Record 1073: Phone is 530-755-8110")
	void PhoneOfRecord1073() {
		assertEquals("530-755-8110", customers.get(1072).getPhone());
	}

	@Test
	@DisplayName("Record 1073: Fax is 530-755-2822")
	void FaxOfRecord1073() {
		assertEquals("530-755-2822", customers.get(1072).getFax());
	}

	@Test
	@DisplayName("Record 1073: Email is shyla@hartsook.com")
	void EmailOfRecord1073() {
		assertEquals("shyla@hartsook.com", customers.get(1072).getEmail());
	}

	@Test
	@DisplayName("Record 1073: Web is http://www.shylahartsook.com")
	void WebOfRecord1073() {
		assertEquals("http://www.shylahartsook.com", customers.get(1072).getWeb());
	}
}
