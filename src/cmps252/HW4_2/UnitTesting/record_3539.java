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
class Record_3539 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3539: FirstName is Winnie")
	void FirstNameOfRecord3539() {
		assertEquals("Winnie", customers.get(3538).getFirstName());
	}

	@Test
	@DisplayName("Record 3539: LastName is Stent")
	void LastNameOfRecord3539() {
		assertEquals("Stent", customers.get(3538).getLastName());
	}

	@Test
	@DisplayName("Record 3539: Company is Pagones, Timothy G Esq")
	void CompanyOfRecord3539() {
		assertEquals("Pagones, Timothy G Esq", customers.get(3538).getCompany());
	}

	@Test
	@DisplayName("Record 3539: Address is 835 E Pittsburgh St")
	void AddressOfRecord3539() {
		assertEquals("835 E Pittsburgh St", customers.get(3538).getAddress());
	}

	@Test
	@DisplayName("Record 3539: City is Greensburg")
	void CityOfRecord3539() {
		assertEquals("Greensburg", customers.get(3538).getCity());
	}

	@Test
	@DisplayName("Record 3539: County is Westmoreland")
	void CountyOfRecord3539() {
		assertEquals("Westmoreland", customers.get(3538).getCounty());
	}

	@Test
	@DisplayName("Record 3539: State is PA")
	void StateOfRecord3539() {
		assertEquals("PA", customers.get(3538).getState());
	}

	@Test
	@DisplayName("Record 3539: ZIP is 15601")
	void ZIPOfRecord3539() {
		assertEquals("15601", customers.get(3538).getZIP());
	}

	@Test
	@DisplayName("Record 3539: Phone is 724-837-3503")
	void PhoneOfRecord3539() {
		assertEquals("724-837-3503", customers.get(3538).getPhone());
	}

	@Test
	@DisplayName("Record 3539: Fax is 724-837-7469")
	void FaxOfRecord3539() {
		assertEquals("724-837-7469", customers.get(3538).getFax());
	}

	@Test
	@DisplayName("Record 3539: Email is winnie@stent.com")
	void EmailOfRecord3539() {
		assertEquals("winnie@stent.com", customers.get(3538).getEmail());
	}

	@Test
	@DisplayName("Record 3539: Web is http://www.winniestent.com")
	void WebOfRecord3539() {
		assertEquals("http://www.winniestent.com", customers.get(3538).getWeb());
	}
}
