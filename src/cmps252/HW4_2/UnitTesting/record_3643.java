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

@Tag("4")
class Record_3643 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3643: FirstName is Colleen")
	void FirstNameOfRecord3643() {
		assertEquals("Colleen", customers.get(3642).getFirstName());
	}

	@Test
	@DisplayName("Record 3643: LastName is Artinger")
	void LastNameOfRecord3643() {
		assertEquals("Artinger", customers.get(3642).getLastName());
	}

	@Test
	@DisplayName("Record 3643: Company is Mai, Clay B Sra")
	void CompanyOfRecord3643() {
		assertEquals("Mai, Clay B Sra", customers.get(3642).getCompany());
	}

	@Test
	@DisplayName("Record 3643: Address is 4848 Lake Rd Se")
	void AddressOfRecord3643() {
		assertEquals("4848 Lake Rd Se", customers.get(3642).getAddress());
	}

	@Test
	@DisplayName("Record 3643: City is Brockport")
	void CityOfRecord3643() {
		assertEquals("Brockport", customers.get(3642).getCity());
	}

	@Test
	@DisplayName("Record 3643: County is Monroe")
	void CountyOfRecord3643() {
		assertEquals("Monroe", customers.get(3642).getCounty());
	}

	@Test
	@DisplayName("Record 3643: State is NY")
	void StateOfRecord3643() {
		assertEquals("NY", customers.get(3642).getState());
	}

	@Test
	@DisplayName("Record 3643: ZIP is 14420")
	void ZIPOfRecord3643() {
		assertEquals("14420", customers.get(3642).getZIP());
	}

	@Test
	@DisplayName("Record 3643: Phone is 585-865-1356")
	void PhoneOfRecord3643() {
		assertEquals("585-865-1356", customers.get(3642).getPhone());
	}

	@Test
	@DisplayName("Record 3643: Fax is 585-865-9071")
	void FaxOfRecord3643() {
		assertEquals("585-865-9071", customers.get(3642).getFax());
	}

	@Test
	@DisplayName("Record 3643: Email is colleen@artinger.com")
	void EmailOfRecord3643() {
		assertEquals("colleen@artinger.com", customers.get(3642).getEmail());
	}

	@Test
	@DisplayName("Record 3643: Web is http://www.colleenartinger.com")
	void WebOfRecord3643() {
		assertEquals("http://www.colleenartinger.com", customers.get(3642).getWeb());
	}
}
