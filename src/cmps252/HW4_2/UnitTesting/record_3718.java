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

@Tag("7")
class Record_3718 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3718: FirstName is Robbie")
	void FirstNameOfRecord3718() {
		assertEquals("Robbie", customers.get(3717).getFirstName());
	}

	@Test
	@DisplayName("Record 3718: LastName is Rawles")
	void LastNameOfRecord3718() {
		assertEquals("Rawles", customers.get(3717).getLastName());
	}

	@Test
	@DisplayName("Record 3718: Company is Prestige Properties")
	void CompanyOfRecord3718() {
		assertEquals("Prestige Properties", customers.get(3717).getCompany());
	}

	@Test
	@DisplayName("Record 3718: Address is 975 E Pittsburgh St")
	void AddressOfRecord3718() {
		assertEquals("975 E Pittsburgh St", customers.get(3717).getAddress());
	}

	@Test
	@DisplayName("Record 3718: City is Greensburg")
	void CityOfRecord3718() {
		assertEquals("Greensburg", customers.get(3717).getCity());
	}

	@Test
	@DisplayName("Record 3718: County is Westmoreland")
	void CountyOfRecord3718() {
		assertEquals("Westmoreland", customers.get(3717).getCounty());
	}

	@Test
	@DisplayName("Record 3718: State is PA")
	void StateOfRecord3718() {
		assertEquals("PA", customers.get(3717).getState());
	}

	@Test
	@DisplayName("Record 3718: ZIP is 15601")
	void ZIPOfRecord3718() {
		assertEquals("15601", customers.get(3717).getZIP());
	}

	@Test
	@DisplayName("Record 3718: Phone is 724-838-7011")
	void PhoneOfRecord3718() {
		assertEquals("724-838-7011", customers.get(3717).getPhone());
	}

	@Test
	@DisplayName("Record 3718: Fax is 724-838-9736")
	void FaxOfRecord3718() {
		assertEquals("724-838-9736", customers.get(3717).getFax());
	}

	@Test
	@DisplayName("Record 3718: Email is robbie@rawles.com")
	void EmailOfRecord3718() {
		assertEquals("robbie@rawles.com", customers.get(3717).getEmail());
	}

	@Test
	@DisplayName("Record 3718: Web is http://www.robbierawles.com")
	void WebOfRecord3718() {
		assertEquals("http://www.robbierawles.com", customers.get(3717).getWeb());
	}
}
