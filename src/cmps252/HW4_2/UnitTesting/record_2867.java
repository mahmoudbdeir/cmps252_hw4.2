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

@Tag("11")
class Record_2867 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2867: FirstName is Garret")
	void FirstNameOfRecord2867() {
		assertEquals("Garret", customers.get(2866).getFirstName());
	}

	@Test
	@DisplayName("Record 2867: LastName is Kazimi")
	void LastNameOfRecord2867() {
		assertEquals("Kazimi", customers.get(2866).getLastName());
	}

	@Test
	@DisplayName("Record 2867: Company is Dickeys Body Shop")
	void CompanyOfRecord2867() {
		assertEquals("Dickeys Body Shop", customers.get(2866).getCompany());
	}

	@Test
	@DisplayName("Record 2867: Address is 9510 Sunflower Ln")
	void AddressOfRecord2867() {
		assertEquals("9510 Sunflower Ln", customers.get(2866).getAddress());
	}

	@Test
	@DisplayName("Record 2867: City is Boise")
	void CityOfRecord2867() {
		assertEquals("Boise", customers.get(2866).getCity());
	}

	@Test
	@DisplayName("Record 2867: County is Ada")
	void CountyOfRecord2867() {
		assertEquals("Ada", customers.get(2866).getCounty());
	}

	@Test
	@DisplayName("Record 2867: State is ID")
	void StateOfRecord2867() {
		assertEquals("ID", customers.get(2866).getState());
	}

	@Test
	@DisplayName("Record 2867: ZIP is 83704")
	void ZIPOfRecord2867() {
		assertEquals("83704", customers.get(2866).getZIP());
	}

	@Test
	@DisplayName("Record 2867: Phone is 208-375-4879")
	void PhoneOfRecord2867() {
		assertEquals("208-375-4879", customers.get(2866).getPhone());
	}

	@Test
	@DisplayName("Record 2867: Fax is 208-375-9208")
	void FaxOfRecord2867() {
		assertEquals("208-375-9208", customers.get(2866).getFax());
	}

	@Test
	@DisplayName("Record 2867: Email is garret@kazimi.com")
	void EmailOfRecord2867() {
		assertEquals("garret@kazimi.com", customers.get(2866).getEmail());
	}

	@Test
	@DisplayName("Record 2867: Web is http://www.garretkazimi.com")
	void WebOfRecord2867() {
		assertEquals("http://www.garretkazimi.com", customers.get(2866).getWeb());
	}
}
