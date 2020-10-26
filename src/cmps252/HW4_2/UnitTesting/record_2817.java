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

@Tag("36")
class Record_2817 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2817: FirstName is Gene")
	void FirstNameOfRecord2817() {
		assertEquals("Gene", customers.get(2816).getFirstName());
	}

	@Test
	@DisplayName("Record 2817: LastName is Klimczyk")
	void LastNameOfRecord2817() {
		assertEquals("Klimczyk", customers.get(2816).getLastName());
	}

	@Test
	@DisplayName("Record 2817: Company is A D T Security Systems")
	void CompanyOfRecord2817() {
		assertEquals("A D T Security Systems", customers.get(2816).getCompany());
	}

	@Test
	@DisplayName("Record 2817: Address is 812 Lincoln St")
	void AddressOfRecord2817() {
		assertEquals("812 Lincoln St", customers.get(2816).getAddress());
	}

	@Test
	@DisplayName("Record 2817: City is Laredo")
	void CityOfRecord2817() {
		assertEquals("Laredo", customers.get(2816).getCity());
	}

	@Test
	@DisplayName("Record 2817: County is Webb")
	void CountyOfRecord2817() {
		assertEquals("Webb", customers.get(2816).getCounty());
	}

	@Test
	@DisplayName("Record 2817: State is TX")
	void StateOfRecord2817() {
		assertEquals("TX", customers.get(2816).getState());
	}

	@Test
	@DisplayName("Record 2817: ZIP is 78040")
	void ZIPOfRecord2817() {
		assertEquals("78040", customers.get(2816).getZIP());
	}

	@Test
	@DisplayName("Record 2817: Phone is 956-724-2976")
	void PhoneOfRecord2817() {
		assertEquals("956-724-2976", customers.get(2816).getPhone());
	}

	@Test
	@DisplayName("Record 2817: Fax is 956-724-2002")
	void FaxOfRecord2817() {
		assertEquals("956-724-2002", customers.get(2816).getFax());
	}

	@Test
	@DisplayName("Record 2817: Email is gene@klimczyk.com")
	void EmailOfRecord2817() {
		assertEquals("gene@klimczyk.com", customers.get(2816).getEmail());
	}

	@Test
	@DisplayName("Record 2817: Web is http://www.geneklimczyk.com")
	void WebOfRecord2817() {
		assertEquals("http://www.geneklimczyk.com", customers.get(2816).getWeb());
	}
}
