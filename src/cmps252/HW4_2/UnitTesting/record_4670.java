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

@Tag("5")
class Record_4670 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4670: FirstName is Francisco")
	void FirstNameOfRecord4670() {
		assertEquals("Francisco", customers.get(4669).getFirstName());
	}

	@Test
	@DisplayName("Record 4670: LastName is Holsclaw")
	void LastNameOfRecord4670() {
		assertEquals("Holsclaw", customers.get(4669).getLastName());
	}

	@Test
	@DisplayName("Record 4670: Company is Ebener, Brian S Esq")
	void CompanyOfRecord4670() {
		assertEquals("Ebener, Brian S Esq", customers.get(4669).getCompany());
	}

	@Test
	@DisplayName("Record 4670: Address is 20061 Doolittle St")
	void AddressOfRecord4670() {
		assertEquals("20061 Doolittle St", customers.get(4669).getAddress());
	}

	@Test
	@DisplayName("Record 4670: City is Gaithersburg")
	void CityOfRecord4670() {
		assertEquals("Gaithersburg", customers.get(4669).getCity());
	}

	@Test
	@DisplayName("Record 4670: County is Montgomery")
	void CountyOfRecord4670() {
		assertEquals("Montgomery", customers.get(4669).getCounty());
	}

	@Test
	@DisplayName("Record 4670: State is MD")
	void StateOfRecord4670() {
		assertEquals("MD", customers.get(4669).getState());
	}

	@Test
	@DisplayName("Record 4670: ZIP is 20879")
	void ZIPOfRecord4670() {
		assertEquals("20879", customers.get(4669).getZIP());
	}

	@Test
	@DisplayName("Record 4670: Phone is 301-330-8313")
	void PhoneOfRecord4670() {
		assertEquals("301-330-8313", customers.get(4669).getPhone());
	}

	@Test
	@DisplayName("Record 4670: Fax is 301-330-5872")
	void FaxOfRecord4670() {
		assertEquals("301-330-5872", customers.get(4669).getFax());
	}

	@Test
	@DisplayName("Record 4670: Email is francisco@holsclaw.com")
	void EmailOfRecord4670() {
		assertEquals("francisco@holsclaw.com", customers.get(4669).getEmail());
	}

	@Test
	@DisplayName("Record 4670: Web is http://www.franciscoholsclaw.com")
	void WebOfRecord4670() {
		assertEquals("http://www.franciscoholsclaw.com", customers.get(4669).getWeb());
	}
}
