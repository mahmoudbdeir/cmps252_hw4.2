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

@Tag("12")
class Record_4988 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4988: FirstName is Teodoro")
	void FirstNameOfRecord4988() {
		assertEquals("Teodoro", customers.get(4987).getFirstName());
	}

	@Test
	@DisplayName("Record 4988: LastName is Stranford")
	void LastNameOfRecord4988() {
		assertEquals("Stranford", customers.get(4987).getLastName());
	}

	@Test
	@DisplayName("Record 4988: Company is Wilkey, Mark E Esq")
	void CompanyOfRecord4988() {
		assertEquals("Wilkey, Mark E Esq", customers.get(4987).getCompany());
	}

	@Test
	@DisplayName("Record 4988: Address is 655 N A St")
	void AddressOfRecord4988() {
		assertEquals("655 N A St", customers.get(4987).getAddress());
	}

	@Test
	@DisplayName("Record 4988: City is Springfield")
	void CityOfRecord4988() {
		assertEquals("Springfield", customers.get(4987).getCity());
	}

	@Test
	@DisplayName("Record 4988: County is Lane")
	void CountyOfRecord4988() {
		assertEquals("Lane", customers.get(4987).getCounty());
	}

	@Test
	@DisplayName("Record 4988: State is OR")
	void StateOfRecord4988() {
		assertEquals("OR", customers.get(4987).getState());
	}

	@Test
	@DisplayName("Record 4988: ZIP is 97477")
	void ZIPOfRecord4988() {
		assertEquals("97477", customers.get(4987).getZIP());
	}

	@Test
	@DisplayName("Record 4988: Phone is 541-744-9632")
	void PhoneOfRecord4988() {
		assertEquals("541-744-9632", customers.get(4987).getPhone());
	}

	@Test
	@DisplayName("Record 4988: Fax is 541-744-6292")
	void FaxOfRecord4988() {
		assertEquals("541-744-6292", customers.get(4987).getFax());
	}

	@Test
	@DisplayName("Record 4988: Email is teodoro@stranford.com")
	void EmailOfRecord4988() {
		assertEquals("teodoro@stranford.com", customers.get(4987).getEmail());
	}

	@Test
	@DisplayName("Record 4988: Web is http://www.teodorostranford.com")
	void WebOfRecord4988() {
		assertEquals("http://www.teodorostranford.com", customers.get(4987).getWeb());
	}
}
