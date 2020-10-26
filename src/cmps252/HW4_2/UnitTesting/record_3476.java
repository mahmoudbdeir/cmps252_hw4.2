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

@Tag("27")
class Record_3476 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3476: FirstName is Joyce")
	void FirstNameOfRecord3476() {
		assertEquals("Joyce", customers.get(3475).getFirstName());
	}

	@Test
	@DisplayName("Record 3476: LastName is Hockema")
	void LastNameOfRecord3476() {
		assertEquals("Hockema", customers.get(3475).getLastName());
	}

	@Test
	@DisplayName("Record 3476: Company is Bps Reprographic Services")
	void CompanyOfRecord3476() {
		assertEquals("Bps Reprographic Services", customers.get(3475).getCompany());
	}

	@Test
	@DisplayName("Record 3476: Address is 1702 Minters Chapel Rd")
	void AddressOfRecord3476() {
		assertEquals("1702 Minters Chapel Rd", customers.get(3475).getAddress());
	}

	@Test
	@DisplayName("Record 3476: City is Grapevine")
	void CityOfRecord3476() {
		assertEquals("Grapevine", customers.get(3475).getCity());
	}

	@Test
	@DisplayName("Record 3476: County is Tarrant")
	void CountyOfRecord3476() {
		assertEquals("Tarrant", customers.get(3475).getCounty());
	}

	@Test
	@DisplayName("Record 3476: State is TX")
	void StateOfRecord3476() {
		assertEquals("TX", customers.get(3475).getState());
	}

	@Test
	@DisplayName("Record 3476: ZIP is 76051")
	void ZIPOfRecord3476() {
		assertEquals("76051", customers.get(3475).getZIP());
	}

	@Test
	@DisplayName("Record 3476: Phone is 817-488-8780")
	void PhoneOfRecord3476() {
		assertEquals("817-488-8780", customers.get(3475).getPhone());
	}

	@Test
	@DisplayName("Record 3476: Fax is 817-488-6268")
	void FaxOfRecord3476() {
		assertEquals("817-488-6268", customers.get(3475).getFax());
	}

	@Test
	@DisplayName("Record 3476: Email is joyce@hockema.com")
	void EmailOfRecord3476() {
		assertEquals("joyce@hockema.com", customers.get(3475).getEmail());
	}

	@Test
	@DisplayName("Record 3476: Web is http://www.joycehockema.com")
	void WebOfRecord3476() {
		assertEquals("http://www.joycehockema.com", customers.get(3475).getWeb());
	}
}
