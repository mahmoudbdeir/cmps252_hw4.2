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
class Record_4398 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4398: FirstName is Olive")
	void FirstNameOfRecord4398() {
		assertEquals("Olive", customers.get(4397).getFirstName());
	}

	@Test
	@DisplayName("Record 4398: LastName is Bonnell")
	void LastNameOfRecord4398() {
		assertEquals("Bonnell", customers.get(4397).getLastName());
	}

	@Test
	@DisplayName("Record 4398: Company is Therm O Lite Inc")
	void CompanyOfRecord4398() {
		assertEquals("Therm O Lite Inc", customers.get(4397).getCompany());
	}

	@Test
	@DisplayName("Record 4398: Address is 1555 Emerson St")
	void AddressOfRecord4398() {
		assertEquals("1555 Emerson St", customers.get(4397).getAddress());
	}

	@Test
	@DisplayName("Record 4398: City is Rochester")
	void CityOfRecord4398() {
		assertEquals("Rochester", customers.get(4397).getCity());
	}

	@Test
	@DisplayName("Record 4398: County is Monroe")
	void CountyOfRecord4398() {
		assertEquals("Monroe", customers.get(4397).getCounty());
	}

	@Test
	@DisplayName("Record 4398: State is NY")
	void StateOfRecord4398() {
		assertEquals("NY", customers.get(4397).getState());
	}

	@Test
	@DisplayName("Record 4398: ZIP is 14606")
	void ZIPOfRecord4398() {
		assertEquals("14606", customers.get(4397).getZIP());
	}

	@Test
	@DisplayName("Record 4398: Phone is 585-254-7485")
	void PhoneOfRecord4398() {
		assertEquals("585-254-7485", customers.get(4397).getPhone());
	}

	@Test
	@DisplayName("Record 4398: Fax is 585-254-7029")
	void FaxOfRecord4398() {
		assertEquals("585-254-7029", customers.get(4397).getFax());
	}

	@Test
	@DisplayName("Record 4398: Email is olive@bonnell.com")
	void EmailOfRecord4398() {
		assertEquals("olive@bonnell.com", customers.get(4397).getEmail());
	}

	@Test
	@DisplayName("Record 4398: Web is http://www.olivebonnell.com")
	void WebOfRecord4398() {
		assertEquals("http://www.olivebonnell.com", customers.get(4397).getWeb());
	}
}
